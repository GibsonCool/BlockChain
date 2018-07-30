package com.gibsoncool.demo

fun main(args: Array<String>) {

    val avGirl = Girl()
    println("我是${avGirl.name},今年${avGirl.age}")
    avGirl.sayHello()
}

//妹子
class Girl {
    //静态属性
    var name: String = "泷泽萝拉"
    var age: Int = 23
    //动态行为
    fun sayHello() {
        println("hello,xixi~~~")
    }
}