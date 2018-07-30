package com.gibsoncool.demo

fun main(args: Array<String>) {
    parseType(1)
    parseType(10L)
    parseType("Double X ")
}

//方法 判断thing类型
fun <T> parseType(thing: T): T {    //前面T定义泛型   参数T使用泛型   最后T返回泛型类型值
    return when (thing) {
        is Int -> {
            println("int类型的参数")
            thing
        }
        is Long -> {
            println("long 类型的参数")
            thing
        }
        else -> {
            println("类型的参数未知")
            thing
        }
    }
}