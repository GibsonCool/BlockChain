package com.gibsoncool.demo

fun main(args: Array<String>) {
    /*-------------定义1到100----------------*/
    val range1 = 1..100
    val range2 = IntRange(1, 100)
    val range3 = 1.rangeTo(100)

    /*-------------长整型long类型定义1到100----------------*/
    val range4 = 1L..100
    val range5 = LongRange(1L, 100)
    val range6 = 1L.rangeTo(100L)


    /*-------------字符char类型区间----------------*/
    val range7 = 'a'..'z'
    val range8 = CharRange('a', 'z')
    val range9 = 'a'.rangeTo('z')



}