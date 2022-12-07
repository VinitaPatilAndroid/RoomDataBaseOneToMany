package com.example.roomdbonetomanyrelation.entites.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.roomdbonetomanyrelation.entites.Director
import com.example.roomdbonetomanyrelation.entites.School


//one to one relation 1st table name with 2nd table
//one to  one relationship diamond shape in relation do not need extra table
data class SchoolAndDirector(
  @Embedded val school: School,
  @Relation(
      parentColumn = "schoolName",
      entityColumn = "schoolName"
  )

  val director: Director
)
