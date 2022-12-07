package com.example.roomdbonetomanyrelation.entites.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.roomdbonetomanyrelation.entites.Student
import com.example.roomdbonetomanyrelation.entites.Subject

data class SubjectWithStudents(
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )

    val student: List<Student>
)
