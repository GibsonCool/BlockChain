package com.gibsoncool.demo4

/**
 * 惰性加载
 * 字段：val  不可变
 * by lazy 既放到成员变量中，可以单独存在
 * by lazy 返回值在最后一样
 * by lazy 是属于线程安全的
 */
val name: String by lazy {
    println("调用了一次")
    "hahahah"
    "张三"
}

fun main(args: Array<String>) {
    println(name)
    println(name)
}

class Person {
//    val name: String by lazy { "张三" }
//    val name2: String = "李四"
}