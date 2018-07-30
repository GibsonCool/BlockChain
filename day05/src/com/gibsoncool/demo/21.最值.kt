package com.gibsoncool.demo

fun main(args: Array<String>) {
    val list = listOf('a','c','z','w')
    println(list.max())
    println(list.min())

    val list1 = listOf(Person("林青霞",50),Person("张曼玉",30),Person("柳岩",70))
    println(list1.maxBy { it.age })
    println(list1.minBy { it.age })
}