package com.gibsoncool.demo5

fun main(args: Array<String>) {
    val pp = Person("cxx", 22, "323234")
}


class Person(var name: String, var age: Int) {
    var phone: String = ""

    //次构函数
    constructor(name: String, age: Int, phone: String) : this(name, age) {
        this.phone = phone
    }
}