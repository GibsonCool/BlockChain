package com.gibsoncool.demo

fun main(args: Array<String>) {
    test()
    test()
    test()

    val tb = testB()
    tb()
    tb()
    tb()
}

/**
 * 函数是不保存状态的  因此a变量调用之后就销毁，从新调用从新创建
 *
 * 闭包：可以让函数携带状态
 */
fun test(): Unit {
    var a = 10
    println(a)
    a++
}

/**
 * 闭包  在kotlin里面我们通说的闭包就是lambda表达式。函数式编程：函数可以作为方法的返回值也可以作为函数参数
 */
fun testB(): () -> Unit {
    var a = 10
    return {
        println(a)
        a++
    }
}