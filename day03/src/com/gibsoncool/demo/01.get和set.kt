package com.gibsoncool.demo

/**
 * kotlin字段是私有的 会自动生成get和set方法  查看字节码反编译为java文件便可以知道
 */
fun main(args: Array<String>) {
    val p = Person()
    println(p.name)
    println(p.age)
    p.age = 2122
}

class Person {
    var name = "张三"
        private set//私有了set方法 ,外部不能修改，内部可以修改
    var age = 10
}