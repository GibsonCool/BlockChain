package com.gibsoncool.demo

fun main(args: Array<String>) {
    var a = 10
    var b = 20
    //a+b
    println(add2(a, b))
    var c = 20

    println(addArg(a, b, c))
    println(addArg(a, b, c,100))
    println(addArg(a, b, c,66,99))

}

fun add2(a: Int, b: Int) = a + b

/**
 * 只要是Int数据类型，无论你传递多少个我都能求他们的和，可变参数使用 vararg表示 ,由args可以推断出可变参数其实是数组
 */
fun addArg(vararg a: Int): Int {
    var result = 0
    val args  = a
    a.forEach {
        result += it
    }
    return result
}