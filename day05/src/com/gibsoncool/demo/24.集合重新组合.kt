package com.gibsoncool.demo

fun main(args: Array<String>) {
    val list1 = listOf(Person("林青霞", 50), Person("张曼玉", 30), Person("柳岩", 70))

    println(list1.map { it.name })
    val map = list1.map { it.age }
    println(map)
    println(list1)

    println(list1.map { it.age }.sortedBy { it })
}