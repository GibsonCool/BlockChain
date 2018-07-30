package com.gibsoncool.demo

fun main(args: Array<String>) {
    /*----------------------打印1到100--------------------------*/

    //for方式
//    for (i in 0..100) {
//        println("i=$i")
//    }

    //while方式
    var a = 0
//    while (a <= 100) {
//        println("a=$a")
//        a++
//    }

    //do ..while
    do {
        println("a=$a")
        a++
    } while (a<=100)
}