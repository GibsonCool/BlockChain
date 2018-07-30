package com.gibsoncool.demo

fun main(args: Array<String>) {
    var a = 10
    var b = 50
    //嵌套有参的lambda表达是，实现a+b
    println({ x: Int, y: Int ->
        x + y
    }.invoke(a, b))


    fun add(x: Int, y: Int): Int {
        return x + y
    }
    println(add(a, b))
}