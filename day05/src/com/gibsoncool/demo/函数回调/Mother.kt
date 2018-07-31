package com.gibsoncool.demo.函数回调

fun main(args: Array<String>) {
    var sp = SuperMakert()
//    sp.buySoy {
//        println("买到${it.name}酱油")
//        println("妈妈开始做菜")
//
//    }

    sp.buySoy(null)
    println("开始做甜点")
}