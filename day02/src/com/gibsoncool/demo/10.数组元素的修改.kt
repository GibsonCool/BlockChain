package com.gibsoncool.demo

fun main(args: Array<String>) {
    val arr = arrayOf(1, 2, 3, 4, 5)

    //修改3为9

    arr[2] = 9
    arr.set(3, 99)
    arr.forEach {
        println(it)
    }
}