package com.gibsoncool.demo.hh2

import com.gibsoncool.demo.Apple
import com.gibsoncool.demo.FruitBox

/**
 * 定义对象的时候使用泛型
 * 定义子类时候执行泛型
 * 定义子类的时候不知道具体类型，继续沿用泛型
 *
 * T:Fruit  泛型上限，泛型只能是Fruit及其子类
 * 泛型作用：放任何类型，限制存放类型
 */
fun main(args: Array<String>) {

    val box = Box<String>("张三")
    println(box.thing)
    val fruitBox = FruitBox(Apple())
    /**
     * 创建不成功，超过了T泛型的上限
     */
//    val fruitBox2  = FruitBox(Thing())

}

open class Box<T>(var thing: T)//定义泛型、使用泛型

//知道具体类型，水果箱子
class FruitBox<T : Fruit>(thingFruit: T) : Box<T>(thingFruit)

//不知道具体类型
class SanBox<T>(thing: T) : Box<T>(thing)


open class Thing
open class Fruit : Thing()

class Apple : Fruit()
class Orange : Fruit()