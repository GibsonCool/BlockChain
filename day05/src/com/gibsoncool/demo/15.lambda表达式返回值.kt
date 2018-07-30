package com.gibsoncool.demo

/**
 * lambda表达式返回值不用使用return关键字，返回值都是取最后一行的返回值
 */
fun main(args: Array<String>) {
    val test = {
        println("hehhe")
        10
        "hellow"
        'a'
    }()
}