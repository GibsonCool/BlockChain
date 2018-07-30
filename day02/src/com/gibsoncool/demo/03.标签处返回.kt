package com.gibsoncool.demo

fun main(args: Array<String>) {
    val str1 = "abc"
    val str2 = "123"

    tag@for (c in str1) {
        tag2@for (c2 in str2) {
            println("$c,$c2")
            if (c == 'b' && c2 == '2')
//                continue
//                break
//                return
                break@tag
        }
    }

    println("最总执行代码")
}