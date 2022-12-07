package com.example.roomdbonetomanyrelation.entites

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Director(
    @PrimaryKey(autoGenerate = false)
    val director:String,
    val schoolName:String
)
