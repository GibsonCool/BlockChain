package com.gibsoncool.demo

fun main(args: Array<String>) {
    val list = listOf("张三","王五","李四","赵六","张四","李五","张三","李六","赵六")
    //以为set没有重复的，直接转set

    println(list.toSet())
    println(list.distinct())
    println(list.distinctBy { it.startsWith("张") }) //这里返回的判断函数返回是true/false
    println(list.distinctBy { it.substring(0,1) })  //这里返回的每个的姓氏 ，，同样姓氏的就不会在加入
}