package com.gibsoncool.demo.day01

fun main(args: Array<String>) {
    val str1 = "abc"
    val str2 = String(charArrayOf('a','b','c'))
    //比较的是值
    println(str1.equals(str2))
    //比较的也是值
    println(str1 == str2)   //最总调用了  public open operator fun equals(other: Any?): Boolean
    //比较的是地址值   (运算符重载，为的是简洁)
    println(str1 === str2)

}