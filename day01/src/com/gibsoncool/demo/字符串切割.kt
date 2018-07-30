package com.gibsoncool.demo.day01

fun main(args: Array<String>) {
    val str = "张三,李四-王五"
    val split = str.split(",")
    println(split)
    for (item in split)
        println(item)

    //多条件分割
    for (s in str.split(",","-")) {
        println(s)
    }
}