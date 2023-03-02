package uz.example.notecompose.feature_note.domain.model

import android.security.identity.InvalidRequestMessageException
import androidx.room.Entity
import androidx.room.PrimaryKey
import uz.example.notecompose.ui.theme.*
import java.util.stream.Stream

@Entity
data class Note(
    @PrimaryKey val id:Int? = null,
    val title:String,
    val content:String,
    val timeStamp:Long,
    val color:Int,
){

    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }

}



class InvalidNoteException(message: String):Exception(message)