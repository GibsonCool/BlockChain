package com.gibsoncool.demo

fun main(args: Array<String>) {

//    val utils1 = Utils()      //出错，无法想普通对象一样创建，
    println(Utils.name)
    Utils.name = "2222"
    Utils.sayHello()
}

// 使用object 关键字设置成一个单列
/**
 * 实际原理：
 * 1、将构造函数放到  static静态代码块中调用初始化
 * 2、所有字段都会是静态的，方法不是
 * 3、适用于字段不多的情况下，因为static随着类加载就初始化调用，比较损耗性能
 * 4、java可以用static控制是否是静态，kotlin并没有static关键字，怎么来做这种限制呢？
 */
object Utils {
    var name = "张三"
    fun sayHello(): Unit {
        println("hellow,$name")
    }
}