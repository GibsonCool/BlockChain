package com.gibsoncool.demo

/**
 * continue和break只能用在普通for循环里面，不能用在forEach中
 */
fun main(args: Array<String>) {
    val str = "abcd"
    for (c in str) {
        if(c == 'c')
//            continue
            break
        println(c)
    }

    /*------------------------高级for------------*/
    str.forEach {
        if(it=='c')
            return
        println(it)
    }
}