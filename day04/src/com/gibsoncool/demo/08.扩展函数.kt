package com.gibsoncool.demo

/**
 * 扩展函数的原理：反编译字节码文件查看
 *      其实就是定义了static静态方法，然后将被扩展类对象当做参数传入,
 *      方法持有对象，因此书写的的时候可以使用this访问对象字段和内容
 *      由于多态的原因子类也可以使用，看起来想被自己继承了一样，但是因为static所以子类无法覆盖重载
 */
fun main(args: Array<String>) {
    val str: String? = null
    println(str?.myIsEmpty())

    println(str.myIsEmpty2())


    val son = Son()
    son.sayHello()
    Father().sayHello()
    Father::sayHello
    sayHello()
}

/**
 * 扩展函数
 *
 * 1、String类扩展   fun 被扩展类.扩展函数名
 * 2、扩展函数可以访问当前对象里面的字段和方法
 */
fun String.myIsEmpty(): Boolean {
    return this == null || this.length == 0
}

/**
 * 扩展可控类型的对象?   使其调用不用加？安全调用方式，并且也有正确判断结果
 */
fun String?.myIsEmpty2(): Boolean {
    return this == null || this.length == 0
}


open class Father{
    fun sayHello(){
        println("爸爸打招呼了")
    }
}


fun Father.sayHello() {
    println("扩展爸爸打招呼了")
}

class Son : Father()