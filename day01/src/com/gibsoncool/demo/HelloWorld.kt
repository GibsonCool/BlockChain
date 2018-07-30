package com.gibsoncool.demo.day01

fun main(args: Array<String>) {
    var list:ArrayList<String> = ArrayList()
    var a:Int = 29
    val hashCode = a.hashCode()
    println(hashCode)
    list.add("sss")
    list.add("6666")
    println(list)
    println("ss".length)
    println(Int.MAX_VALUE, Int.MIN_VALUE)

    var b = 10L
    var c = " 陈鑫星 "
    println(b.hashCode().javaClass)
    println(c.javaClass)
    println(list.javaClass)
    var e = "10"
    println(e.toInt().equals(b))


}

fun println(maX_VALUE: Int, miN_VALUE: Int) {
    print(maX_VALUE)
    print(",")
    print(miN_VALUE)
    println()
}


