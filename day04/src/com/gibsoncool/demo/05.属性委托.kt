package com.gibsoncool.demo3

import kotlin.reflect.KProperty

fun main(args: Array<String>) {

    val bigHeadSon = BigHeadSon()
    bigHeadSon.money = 100
    println(bigHeadSon.money)
}


class BigHeadSon {
    var money: Int  by Monther()
//    val tt:String by Monther()
}

class SmallHeadSon(var monther: Monther) {
    var money: Int by monther

}

class Monther {
    operator fun getValue(bigHeadSon: BigHeadSon, property: KProperty<*>): Int {
        return sonMoney
    }

    operator fun setValue(bigHeadSon: BigHeadSon, property: KProperty<*>, i: Int) {
        sonMoney += i / 2
        selfMoney += i / 2
    }

    operator fun getValue(smallHeadSon: SmallHeadSon, property: KProperty<*>): Int {
        return sonMoney
    }

    operator fun setValue(smallHeadSon: SmallHeadSon, property: KProperty<*>, i: Int) {
        sonMoney += i / 2
        selfMoney += i / 2
    }

    var sonMoney = 0
    var selfMoney = 0
}