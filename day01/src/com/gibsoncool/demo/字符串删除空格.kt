package com.gibsoncool.demo.day01

fun main(args: Array<String>) {
    /*-----------普通字符串删除空格-------------*/
    val str = "  张珊  "
    println(str)
    println(str.trim())


    /*-----------原样字符串输出-------------*/
    val str2 = """
        |张三
       | 李四
        王五|
    """
    println(str2)
    println("******************")
    println(str2.trim())

    println("******************")
    println(str2.trimIndent())

    println("******************")
    println(str2.trimMargin("|"))
}