package com.gibsoncool.demo

fun main(args: Array<String>) {

    //求n的阶乘
    println(fact(5))

    println(ff(5))
}

/**
 * 求n的阶乘
 */
fun fact(a: Int): Int {
    if (a == 1) {
        return 1
    } else {
        return a * fact(a - 1)
    }
}

/**
 * 菲波那切数列
 */
fun ff(a: Int): Int {
    if (a == 1 || a == 2)
        return 1
    else {
        return ff(a - 1) + ff(a - 2)
    }
}