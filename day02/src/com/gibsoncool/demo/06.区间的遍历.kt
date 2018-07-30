package com.gibsoncool.demo

fun main(args: Array<String>) {
    val range = 1.rangeTo(5)

    for (i in range) {
        println(i)
    }

    for ((index,i) in range.withIndex()) {
        println("index:$index,i=$i")
    }

    range.forEach {
        println("it:$it")
    }

    range.forEachIndexed { index, i ->
        println("forEach index:$index,i$i")
    }
}