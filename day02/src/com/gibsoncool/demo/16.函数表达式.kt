package com.gibsoncool.demo


fun main(args: Array<String>) {
    var a = 10
    var b = 20
    println(add(a, b))
}

//fun add(a: Int, b: Int): Int {
//    return a + b
//}
/**
 * 函数体只有一行代码，可以省略{} 省略return  直接用=链接
 */
fun add(a: Int, b: Int) = a + b