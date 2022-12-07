package com.example.roomdbonetomanyrelation.entites.relations

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.roomdbonetomanyrelation.entites.Student

@Entity(primaryKeys = ["studentName","subjectName"])
data class StudentSubjectCrossRef (
    val studentName:String,
    val subjectName :String
        )