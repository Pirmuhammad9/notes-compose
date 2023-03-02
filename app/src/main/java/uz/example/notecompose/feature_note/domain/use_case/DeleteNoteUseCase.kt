package uz.example.notecompose.feature_note.domain.use_case

import uz.example.notecompose.feature_note.domain.model.Note
import uz.example.notecompose.feature_note.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) = repository.deleteNote(note)
}