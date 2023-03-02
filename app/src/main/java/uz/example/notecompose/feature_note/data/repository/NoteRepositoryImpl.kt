package uz.example.notecompose.feature_note.data.repository

import kotlinx.coroutines.flow.Flow
import uz.example.notecompose.feature_note.data.data_source.NoteDao
import uz.example.notecompose.feature_note.domain.model.Note
import uz.example.notecompose.feature_note.domain.repository.NoteRepository

class NoteRepositoryImpl(
    private val dao:NoteDao
) :NoteRepository{
    override fun getNotes(): Flow<List<Note>> = dao.getNotes()

    override suspend fun getNoteById(id: Int): Note? = dao.getNoteById(id)

    override suspend fun insertNote(note: Note) = dao.insertNote(note)

    override suspend fun deleteNote(note: Note) = dao.deleteNote(note)
}