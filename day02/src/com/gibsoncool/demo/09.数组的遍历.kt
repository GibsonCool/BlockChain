package com.gibsoncool.demo

fun main(args: Array<String>) {
    val arrStr = arrayOf("张三", "李四", "王五")
    val arrAge = arrayOf(10, 3, 55)
    val arrChar = arrayOf('a', 'b', 'c')
    // Any 类似  java中的object
    val arr3 = arrayOf("张三", 10, 'a')
    /*--------------for------------------*/
    for (s in arrStr) {
        println(s)
    }

    arrAge.forEach {
        println(it)
    }

    arrChar.forEachIndexed { index, c ->
        println("index=$index,char=$c")
    }

    arr3.forEachIndexed { index, any ->

        println("index=$index,any=$any")
    }
}