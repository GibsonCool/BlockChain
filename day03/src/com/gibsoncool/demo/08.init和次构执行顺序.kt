package com.gibsoncool.demo6

fun main(args: Array<String>) {

    val p = Person("cxx",22,"188888")
}

class Person(var name:String,var age:Int){
    init {
        println("执行了初始化init")
    }

    constructor(name: String,age: Int,phone:String):this(name, age){
        println("执行了次构函数")
    }
}