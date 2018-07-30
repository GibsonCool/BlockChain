package com.gibsoncool.demo.day01

fun main(args: Array<String>) {
    println(createDiary("世界之窗"))
}

fun createDiary(place: String): String {
    //java 的处理方式
//    val result = "今天天气晴朗，万里无云，我们去" + place + "游玩，首先映入眼帘的是，" + place + place.length + "个鎏金的大字"
    //kotlin的方式
    val result = "今天天气晴朗，万里无云，我们去游玩$place，首先映入眼帘的是$place${place.length}，个鎏金的大字${sayHai()}"
    return result
}

fun sayHai(): String {
    return "Hai"
}