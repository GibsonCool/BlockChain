package com.gibsoncool.demo7

fun main(args: Array<String>) {

    println(Utils.name)
    println(Utils.instal.agent)
}

class Utils {
    private constructor()       //第一步、私有构造函数

    //非静态
    var agent = 20

    companion object {
        //静态
        var name = "张三丰"

        val instal by lazy {
            println("被加载了")
            Utils()
        }//惰性加载，且只会加载一次，线程安全

    }
}

