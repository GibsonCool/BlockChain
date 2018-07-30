package com.gibsoncool.demo.hh4


fun main(args: Array<String>) {
    val list = ArrayList<Fruit>()
    setFruitList(list)

    val list2 = ArrayList<Apple>()
    setFruitListOut(list2)

    val list3 = ArrayList<Thing>()
    setFruitListIn(list3)
}


fun setFruitList(list:ArrayList<Fruit>): Unit { //kotlin这样定义之后，只能接受Fruit类型的，其子类无法接受
    println(list)
}


/**
 * out:接受当前类型或者其子类  相当于java的：  ？ extend
 */
fun setFruitListOut(list:ArrayList<out Fruit>) {
    println(list)
}

/**
 * in：接受当前类型或者它的父类 相当于java的：  ？ super
 */
fun setFruitListIn(list:ArrayList<in Fruit>){
    println(list)
}


open class Box<T>(var thing: T)//定义泛型、使用泛型

abstract class Thing
abstract class Fruit : Thing()

class Apple : Fruit()
class Orange : Fruit()

