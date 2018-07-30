package com.gibsoncool.demo

fun main(args: Array<String>) {
    val str = "abcd"
    /*--------------for循环----------------*/
    //可遍历例字符串
    for (c in str) {
        println(c)
    }
    //角标遍历
    for ((index,c) in str.withIndex()) {
        println("index:$index, Char:$c")
    }

    /*--------------forEach循环----------------*/
    str.forEach {
        println(it)
    }

    str.forEachIndexed { index, c ->
        println("index = $index, c = $c")
    }

}