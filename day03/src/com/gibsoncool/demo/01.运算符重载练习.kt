package com.gibsoncool.demo

fun main(args: Array<String>) {

    var t1 = Teacher()
    println("${t1.level},${t1.salary}")
    val t2  = t1++
    println("${t2.level},${t2.salary}")
    println(t1 == t2)
    println(t1 === t2)
}


class Teacher{
    var level = 1
    var salary = 6000

    operator fun inc():Teacher{
        this.level++
        this.salary+=2000
        return this
    }

}