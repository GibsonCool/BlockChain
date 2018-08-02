package com.gibsoncool.demo.test1

open class Father {
    open fun sayHello() {
        println("father say hello")
    }
}

/**
 * Father的扩展方法与其内部方法同名
 */
fun Father.sayHello() {
    println("扩展 Father say hello")
}

class Son : Father(){
    override fun sayHello(){
        super.sayHello()
        println("son say hello")
    }
}


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