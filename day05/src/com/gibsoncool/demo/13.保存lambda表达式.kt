package com.gibsoncool.demo

fun main(args: Array<String>) {
    //保存lambda表达式
    val block:(()->Unit)?={
        println("hellow ")
        3
    }
    //调用lambda表达式
    block?.invoke()
    println(block?.invoke())
    test1()
}

val test1 =  {
    println("tests")
}