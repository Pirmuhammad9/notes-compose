package uz.example.notecompose.feature_note.domain.use_case

data class NoteUseCase(
    val getNotes:GetNotesUseCase,
    val deleteNotes:DeleteNoteUseCase,
    val addNote:AddNoteUseCase,
    val getNote: GetNote
)