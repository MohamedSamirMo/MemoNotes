package com.example.notesapp.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

// Room DataBase Create
@Entity(tableName = "notes")
@Parcelize
//Define data class
data class Note(

    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val noteTitle:String,
    val noteDesc:String
):Parcelable
