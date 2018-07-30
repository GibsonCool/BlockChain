package com.gibsoncool.demo.day01

fun main(args: Array<String>) {
    val place = "广东省深圳市福田区"
    println(place)


    //换行
    val place2 = "广东省\n深圳市\n福田区"
    println(place2)


    //怎样写就怎样输出
    /*-------原样输出字符串--------*/
    val place3 = """
            广东省
           深圳市
        福田区
        """.trimIndent()
    println(place3)
}