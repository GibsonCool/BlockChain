package com.gibsoncool.demo.day01

fun main(args: Array<String>) {
    //输出数据
    val a = 10
    println(a)

    //m+n
    var m: Int
    var n: Int
    m = readLine()?.toInt() ?: 0
    n = readLine()?.toInt() ?: 0

    println("m+n=${m + n}")

}