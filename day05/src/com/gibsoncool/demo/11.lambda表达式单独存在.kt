package com.gibsoncool.demo

fun main(args: Array<String>) {
    //嵌套匿名函数
//    {
//        println("匿名 hellow")
//    }()
    //不能通过名称调用

    {
        println("匿名 invoke hellow")
    }.invoke()


//    //嵌套有名函数
//    fun sayHello(): Unit {
//        println("hellow")
//    }
//    sayHello()
}

