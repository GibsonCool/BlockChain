package com.gibsoncool.demo

fun main(args: Array<String>) {
    val arr = arrayOf("张三","李四","王五","张三","赵六")
    //查找第一个“张三”的角标
    //
    val index = arr.indexOf("张三")
    val indexNull = arr.indexOf("张三33")
    println(index)
    println(indexNull)
    val lastIndex  = arr.lastIndexOf("张三")
    println(lastIndex)
    //查找第一个姓张的人
    arr.forEachIndexed { index, s ->
        if(s.startsWith("张"))
            println("张：$s,$index")
    }


    val index3 = arr.indexOfFirst {
        it.startsWith("张")
    }
    println(index3)

    val index4 = arr.indexOfLast {
        it.startsWith("张")
    }
    println(index4)
}