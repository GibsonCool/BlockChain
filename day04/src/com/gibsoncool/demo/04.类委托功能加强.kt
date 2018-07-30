package com.gibsoncool.demo2

fun main(args: Array<String>) {

    val smallHeadFather = SmallHeadFather()
    smallHeadFather.wash()

    val smallHeadFather2 = SmallHeadFather2()
    smallHeadFather2.wash()

    val son = BigHeadSon()
    val smallHeadFather3 = SmallHeadFather3(son)
    smallHeadFather3.wash()
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

/**
 * 通过传参数，并by具体参数来实现
 */
class SmallHeadFather3(var washPower: WashPower) : WashPower by washPower {
    override fun wash() {
        println("付钱给儿子")
        this.washPower.wash()
        println("干的好")
    }
}