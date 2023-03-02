package uz.example.notecompose.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.example.notecompose.feature_note.data.data_source.NoteDataBase
import uz.example.notecompose.feature_note.data.repository.NoteRepositoryImpl
import uz.example.notecompose.feature_note.domain.repository.NoteRepository
import uz.example.notecompose.feature_note.domain.use_case.*
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDataBase {
        return Room.databaseBuilder(
            app, NoteDataBase::class.java,
            NoteDataBase.DATA_BASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDataBase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }


    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCase {
        return NoteUseCase(
            getNotes = GetNotesUseCase(repository),
            deleteNotes = DeleteNoteUseCase(repository),
            addNote = AddNoteUseCase(repository),
            getNote = GetNote(repository)
        );
    }

}