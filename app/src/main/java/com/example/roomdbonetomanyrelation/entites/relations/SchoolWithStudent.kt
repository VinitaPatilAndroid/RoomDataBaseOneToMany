package com.example.roomdbonetomanyrelation.entites.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.roomdbonetomanyrelation.entites.School
import com.example.roomdbonetomanyrelation.entites.Student

data class SchoolWithStudent(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )

    val students :List<Student>
)
