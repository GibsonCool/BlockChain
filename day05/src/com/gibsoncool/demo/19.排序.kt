package com.gibsoncool.demo

fun main(args: Array<String>) {
    val list = listOf("z", "b", "d")
    //    正序排序  b d z
    println(list.sorted())
//    倒序排序
    println(list.sortedDescending())
//    按字段排序
    val list2 = listOf(Person1("cxx", 29), Person1("lcf", 23), Person1("haha", 30))
    println(list2.sortedBy { it.age })
    println(list2.sortedByDescending { it.age })
}

data class Person1(var name: String, var age: Int)