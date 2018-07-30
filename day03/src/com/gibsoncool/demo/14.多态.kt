package com.gibsoncool.demo

fun main(args: Array<String>) {

    val dog:Animal =Dog()
    val cat = Cat()
    dog.call()
    cat.call()
}

abstract class Animal {
    var name = ""
    open fun call() {
        println("动物叫")
    }
}

class Dog : Animal() {
    override fun call() {
        println("狗狗汪汪叫")
    }
}

class Cat : Animal() {
    override fun call() {
        println("猫咪喵喵叫")
    }
}