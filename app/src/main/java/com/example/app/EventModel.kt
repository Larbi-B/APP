package com.example.app

import java.sql.Date
import java.sql.Time
import java.time.DateTimeException

class EventModel(
    val name:String = "Football",
    val catégory:String = "Football",
    var imgUrl:String = "",
    val adresse:String,
//    val date: Date,
//    val time:Time,
    var nombrJoins:Int,
    val nombreMax:Int,
    var joinable:Boolean = true
)