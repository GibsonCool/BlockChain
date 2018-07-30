package com.gibsoncool.demo.day01

fun main(args: Array<String>) {
    //定义二元元组
    val pair = Pair<String,Int>("GibsonCool",24)
    println(pair.first)
    println(pair.second)

    val pair2 = "张三" to 24
    println(pair2.first)
    println(pair2.second)

    //三元元组

    val triple =  Triple<String,Int,Long>("Gibsoncool",24,66)
    println(triple.first)
    println(triple.second)
    println(triple.third)
}


fun  getInfo(name:String,age:Int):Pair<String,Int>{
    return Pair<String,Int>(name,age)
}