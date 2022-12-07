package com.example.roomdbonetomanyrelation.entites.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.roomdbonetomanyrelation.entites.Student
import com.example.roomdbonetomanyrelation.entites.Subject

data class StudentWithSubjects(
    @Embedded val student: Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )

    val subject : List<Subject>
)
