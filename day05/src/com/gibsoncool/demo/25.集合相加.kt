package com.gibsoncool.demo

fun main(args: Array<String>) {
    val list1 = listOf(Person("林青霞", 50), Person("张曼玉", 30), Person("柳岩", 70))

    println(list1.sumBy { it.age })

    println(list1.sumByString { it.name })
}

fun <T> Iterable<T>.sumByString(slecetor: (T) -> String): String {
    var str = "结果："
    for (item in this) {
        str += slecetor(item) + "-->"
    }
    return str
}