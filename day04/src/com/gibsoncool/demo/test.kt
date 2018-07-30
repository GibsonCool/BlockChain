package com.gibsoncool.demo.test1

open class Father {
    val name = "搞事情"
    fun sayHello() {
        println("father say hello,$name")
    }
}

/**
 * Father的扩展方法与其内部方法同名
 */
fun Father.sayHello() {
    println("扩展 Father say hello,${this.name}")
}

class Son : Father()


fun main(args: Array<String>) {
    val father = Father()
    val son = Son()
    father.sayHello()   //输出结果：father say hello
    son.sayHello()   //输出结果：father say hello
    /**
     * 如何调用才能输出： 扩展 Father say hello
     * 是否有其他语法糖使用？ 还是Kotlin设计就忽视我这种 "搞事情" 的操作
     */
}