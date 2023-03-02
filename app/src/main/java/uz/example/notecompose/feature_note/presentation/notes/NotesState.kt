package uz.example.notecompose.feature_note.presentation.notes

import uz.example.notecompose.feature_note.domain.model.Note
import uz.example.notecompose.feature_note.domain.util.NoteOrder
import uz.example.notecompose.feature_note.domain.util.OrderType

data class NotesState(
    val notes:List<Note> = emptyList(),
    val noteOrder:NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible:Boolean = false
) {
}