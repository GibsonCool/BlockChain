package com.gibsoncool.demo.day01


/**
 * kotlin的if语法有返回值，java的if咩有返回值
 * kotlin表达式语法（有返回值）  java 声明式语法（没有返回值）
 * kotlin一般都有返回值（函数式编程：闭包思想）
 */

fun main(args: Array<String>) {
    val a = 9
    val b = 30
    //findMax
    println(max(a, b))
}

fun max(x: Int, y: Int): Int {
    //java写法
//    return x>y?x:y
    //kotlin写法
    return if (x > y) x else y
}