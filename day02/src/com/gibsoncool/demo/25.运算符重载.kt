package com.gibsoncool.demo2

/**
 * 1、找到运算符对应的函数
 * 2、函数前加上Operator
 */

fun main(args: Array<String>) {
    val girl1 = Girl()
    girl1.name = " 李四"
    val girl2 = Girl()
    val a = 10
    val b = 20
    println(a + b)
    println(a.plus(b))

    val newGirl = girl1 + girl2
    println(newGirl.name + newGirl.age)
    println((newGirl+100).age)
}

class Girl {
    var name: String = "范冰冰"
    var age: Int = 40

    operator fun plus(girl: Girl): Girl {
        return this
    }

    operator fun plus(age: Int): Girl {
        this.age += age
        return this
    }
}