package com.gibsoncool.demo

/**
 * 定义对象的时候使用泛型
 * 定义子类时候执行泛型
 * 定义子类的时候不知道具体类型，继续沿用泛型
 */
fun main(args: Array<String>) {

    val box = Box<String>("张三")
    println(box.thing)
}

open class Box<T>(var thing: T)//定义泛型、使用泛型

//知道具体类型，水果箱子
class FruitBox(thingFruit: Fruit) : Box<Fruit>(thingFruit)

//不知道具体类型
class SanBox<T>(thing: T) : Box<T>(thing)

abstract class Fruit

class Apple : Fruit()
class Orange : Fruit()