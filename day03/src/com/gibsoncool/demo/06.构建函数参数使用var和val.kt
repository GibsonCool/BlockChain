package com.gibsoncool.demo4

fun main(args: Array<String>) {
    val p = Person("张三", 454)
    p.name = ":cxcx"
    println(p.name)
//    p.age = 10        无法修改
    println(p.age)
//    println(p.age)
}

/**
 * 创建的时候需要修改初始化里面的name/age
 */
//class Person {
//    var name = "张三"
//    var age = 10
//}

class Person(var name: String, val age: Int, man: Boolean = false) {


}