package com.example.roomdbonetomanyrelation

import android.content.Context
import androidx.core.content.contentValuesOf
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.roomdbonetomanyrelation.entites.Director
import com.example.roomdbonetomanyrelation.entites.School
import com.example.roomdbonetomanyrelation.entites.Student
import com.example.roomdbonetomanyrelation.entites.Subject
import com.example.roomdbonetomanyrelation.entites.relations.StudentSubjectCrossRef
import java.time.Instant

@Database(entities = [
    School::class,
    Student::class,
    Director::class,
    Subject::class,
    StudentSubjectCrossRef::class
],
version = 1)
abstract class SchoolDatabase :RoomDatabase(){
     abstract val schoolDao :SchoolDao

     companion object{
         @Volatile
         private var Instant : SchoolDatabase? = null

         fun getInstance(context:Context):SchoolDatabase{
             // synchronized is nothing but execute block for code
             //executed by single thread
             synchronized(this){

                 return Instant ?: Room.databaseBuilder(
                     context.applicationContext,
                     SchoolDatabase::class.java,
                     "school_db"
                 ).build().also {
                     Instant = it
                 }
             }
         }
     }
}