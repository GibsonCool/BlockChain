package com.gibsoncool.demo2



fun main(args: Array<String>) {
    val p = Person("张三", 454)
//    p.name   //无法使用查看字节码反编译内容，java类没有这个字段，只是 构造函数传入了两个参数
}

/**
 * 创建的时候需要修改初始化里面的name/age
 */
//class Person {
//    var name = "张三"
//    var age = 10
//}

class Person(name: String, age: Int) {

}