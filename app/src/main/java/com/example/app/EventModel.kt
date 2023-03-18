package com.example.app

enum class Category
{
    football,
    basketball
}

class EventModel (
    var imgUrl:String = "",
    var name:String,
    var category:Category,
    var effectifMax:Int,
    var effectif:Int,
    var dispo:Boolean
        ) {
}