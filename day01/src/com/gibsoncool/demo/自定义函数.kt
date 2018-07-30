package com.gibsoncool.demo.day01

fun main(args: Array<String>) {
    sayHello()
    sayHello2()
    sayHello1("cxx")
    println(sayHello3("cxx"))

}


//无参无返回
fun sayHello(): Unit {
    println("hello")
}

//可以简写，去掉返回类型
fun sayHello2() {
    println("hello2")
}


//有参无返回值
fun sayHello1(name: String) {
    println("hello1" + name)
}

//有参有返回值
fun sayHello3(name: String): Int {
    return name.length
}