package com.gibsoncool.demo

fun main(args: Array<String>) {
    val zhHuman = ZhHuman()
    val usHuman = UsHuman()
    val afHuman = AfHuman()

}

/**
 * 抽象类不用Open关键字
 */
abstract class Human {
    //肤色
    abstract var color: String
    //语言
    abstract var language: String

    abstract fun eat()
}

open class ZhHuman : Human() {
    override var color: String = "黄色"
    override var language: String = "中文"


    override fun eat() {
        println("用筷子吃饭")
    }
}

open class UsHuman : Human() {
    override var color: String = "白色"
    override var language: String = "英语"

    override fun eat() {
        println("使用刀叉")
    }
}

class AfHuman : Human() {
    override var color: String = "黑色"
    override var language: String = "葡萄牙语"

    override fun eat() {
        println("用手吃饭")
    }
}