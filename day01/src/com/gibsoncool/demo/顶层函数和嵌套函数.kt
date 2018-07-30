package com.gibsoncool.demo.day01

/*
    函数式编程，函数是一等公民，函数可以独立于对象单独存在
    在面向对象 java中，对象是一等公民，对象可以嵌套对象 例如：类部类
    kotlin中函数是一等公民，同理函数中也可以嵌套函数
 */

fun main(args: Array<String>) {
    haha()
}

//顶层函数
fun haha(){
    fun xixi(){
        println("xixi")
    }
    xixi()
}