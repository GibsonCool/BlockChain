package com.gibsoncool.demo.hh3


/**
 *kotlin泛型擦除
 * 两种类型应该是不一样的
 * 必须通过反射获取泛型类型
 *
 *
 * 解决泛型擦除方案：
 * 1、泛型前加 reified 关键字
 * 2、方法钱加上 inline 关键字
 *
 */
fun main(args: Array<String>) {
    val box1 = Box("")
    val box2 = Box(2)
    println(""::class)
    println(""::class.java)


    println("${box1.nameOrAge.javaClass},${box2.nameOrAge.javaClass}")

    println("${box1.javaClass.name},${box1.javaClass}")
    println("${box2.javaClass.name},${box2.javaClass}")


    println(box1.javaClass == box2.javaClass)
    println(box1.javaClass === box2.javaClass)


    parseType(10)
    parseType("10")

    parseType(box1)
    parseType(box2)

}

class Box<T>(var nameOrAge: T)

fun <T> parseTypeNotReified(thing: T) {
//    T::class.java     //无法直接获取，需要使用 inline  以及  refied
}

inline fun <reified T> parseType(thing: T) {
    val name = T::class.java.name
    println(name)
}


