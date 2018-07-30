package com.gibsoncool.demo

fun main(args: Array<String>) {
    val list = listOf("吴彦祖", "陈冠希", "阮经天")
    for (s in list) {
        println("for:$s")
    }

    list.forEach {
        println("forEach$it")
    }
}