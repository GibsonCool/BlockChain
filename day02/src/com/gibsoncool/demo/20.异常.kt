package com.gibsoncool.demo

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main(args: Array<String>) {
    var a = 10
    var b = 20
    try {
        a / 0
    } catch (e: Exception) {
        println("异常产生:${e.localizedMessage}")
    }
    finally {
        println("最终要执行的代码")
    }

    /**
     * kotlin编译时异常
     *
     * kotlin不检查编译时异常
     * kotlin认为大部门的编译时异常都是没有必要的
     */
    val file = File("a.txt")
    val bfr = BufferedReader(FileReader(file))
}