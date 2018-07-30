package com.gibsoncool.demo.hh5


fun main(args: Array<String>) {

    val list1 = ArrayList<Int>()
    val list2 = ArrayList<String>()

    setFruitList(list1)
    setFruitList(list2)

    setFruitListByT(list1)
    setFruitListByT(list2)
}

//Array 里面要求可以接受任何类型
fun <T> setFruitListByT(list: ArrayList<T>) {
    println(list)
}

/**
 * 直接使用 *  可以传递任何类型，相当于java的  ?
 */
fun setFruitList(list: ArrayList<*>): Unit {
    println(list)
}