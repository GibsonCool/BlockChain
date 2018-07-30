package com.gibsoncool.demo

fun main(args: Array<String>) {

    val smallHeadFather = SmallHeadFather()
    smallHeadFather.wash()
    val smallHeadFather2 = SmallHeadFather2()
    smallHeadFather2.wash()
}


interface WashPower {
    fun wash()
}

class BigHeadSon : WashPower {
    override fun wash() {
        println("大头儿子开始洗碗")
    }
}

class SmallHeadFather : WashPower {
    val son = BigHeadSon()
    override fun wash() {
        son.wash()
    }
}

/**
 * 直接通过  by 关键字实现
 */
class SmallHeadFather2 : WashPower by BigHeadSon()