package com.gibsoncool.demo


fun main(args: Array<String>) {
    var a = 10
    var b = 20
    println(add1(a, b))

    // :: 获取add函数的引用
    val padd = ::add1
    //通过padd变量调用函数
//    println(padd?(a, b))  错误无法这样使用
    println(padd(a, b))
    //可以处理函数变量为空的情况下调用
    println(padd.invoke(a, b))
    println(padd?.invoke(a, b))

    /*--------------函数变量-----------------*/
    val padd2: (Int, Int) -> Int = { a, b -> a + b }    //匿名函数
    println(padd2(a, b))
}

/**
 * 函数体只有一行
 * 顶层函数
 */
fun add1(a: Int, b: Int): Int {
    return a + b
}
