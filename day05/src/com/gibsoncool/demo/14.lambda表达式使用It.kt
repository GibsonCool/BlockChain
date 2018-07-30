package com.gibsoncool.demo

/**
 * lambda表达式使用的时候，如果只有一个参数可以省略参数名，默认使用“it”来表示使用
 */
fun main(args: Array<String>) {
    //调用
    var a = 10

    //函数引用
    var result = haha(a, ::padd)
    println(result)


    //匿名表达式lambda
    result = haha(a, { m ->
        m + 20
    })
    println(result)

    //变量保存匿名表达式
    result = haha(a, plambda)
    println(result)


    //只有一个参数的时候可以不写参数
    result = haha(a, {
        it + 17
    })
    println(result)
}

fun haha(a: Int, block: (Int) -> Int): Int {
    return block(a)
}

fun padd(a: Int): Int {
    return a + 15
}

val plambda = { m: Int ->
    m + 16
}