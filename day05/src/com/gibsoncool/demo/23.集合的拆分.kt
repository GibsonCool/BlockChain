package com.gibsoncool.demo

fun main(args: Array<String>) {
    val list = listOf("张三", "王五", "李四", "赵六", "张四", "李五", "张三", "李六", "赵六")

    val partition = list.partition { it.startsWith("张") }
    println(partition.first)
    println(partition.second)
}