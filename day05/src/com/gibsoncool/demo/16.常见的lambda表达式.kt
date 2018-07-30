package com.gibsoncool.demo

fun main(args: Array<String>) {
    //forEach
    /**
     * forEach 是一个扩展函数 CharSequence.forEach ，String是CharSequence子类
     * forEach 的参数接受一个函数
     */
    String()
    val str = "adbc"
    str.forEach {
        println(it)
    }

    str.forEach(::myPrint)
    str.forEach(::println)


    //indexof
    /**
     * indexOfFirst 是一个扩展函数Array<out T>.indexOfFirst  ，接受一个函数参数
     */
    val array = arrayOf("林青霞", "张曼玉")
    val index = array.indexOfFirst {
        it.startsWith("0")
    }
}


fun myPrint(x: Char): Unit {
    println("x:$x")
}