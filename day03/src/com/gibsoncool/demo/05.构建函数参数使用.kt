package com.gibsoncool.demo3

fun main(args: Array<String>) {
    val p = Person("张三", 454)
    println(p.name)
}

/**
 * 创建的时候需要修改初始化里面的name/age
 */
//class Person {
//    var name = "张三"
//    var age = 10
//}

class Person(name: String, ages: Int) {
    var name: String = ""
    var age: Int = 0

    init {
        this.name = name
        age = ages
    }

}