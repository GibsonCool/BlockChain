package com.gibsoncool.demo.day01


const val c:Int = 90    //等同于public static final int c = 90;
fun main(args: Array<String>) {
    //可变变量
    var a:Int = 10
    a = 20
    //不可变变量
    val b:Int = 11
//    b = 23  编译不过
    println(a)
    println(b)
    println(c)
}