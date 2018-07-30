package com.gibsoncool.demo

fun main(args: Array<String>) {
    val son = Son()
    println(son.age)
    println(son.name)
    son.horbe()

}

/**
 * kotlin原生的类都是 final的，不能被继承，如需要被继承需要手动添加 open表示可以被继承
 * kotlin类中的属性和方法也是同样的，如果需要被重载，覆盖也需要open
 */
open class Father {
    open var name = "张是哪"
    open var age = 20
    open fun horbe() {
        println("父亲喜欢抽烟")
    }
}

class Son : Father() {
    override var name = "liubi"
    override var age = 60
    override fun horbe() {
        println("儿子喜欢泡妞")
    }
}