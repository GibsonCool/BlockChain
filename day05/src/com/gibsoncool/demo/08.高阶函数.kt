package com.gibsoncool.demo

fun main(args: Array<String>) {

    var a = 10
    var b = 20
    var sum = 0 //a+b
    var result = 0 //a-b
    sum = add(a, b)
    result = sub(a, b)
    println("sum:$sum")
    println("result:$result")


    //调用擦cacl函数传递需要的工具函数求出对应的值
    sum = cacl(a,b,::add)
    result = cacl(a,b,::sub)
    println("sum:$sum")
    println("result:$result")
}

fun add(x: Int, y: Int): Int {
    return x + y
}

fun sub(a: Int, b: Int): Int {
    return a - b
}

/**
 * a:第一个参数
 * b:第二个参数
 * block: 第三个函数是函数类型，闭包中传递的函数、也就是传递的工具：add/sub函数
 * 返回值：最终返回值，使用工具 add/sub求出的值
 *
 * kotlin里面的函数可以传递函数参数，称为高阶函数
 */
fun cacl(a: Int, b: Int, block: (Int, Int) -> Int): Int {
    return block.invoke(a, b)
}