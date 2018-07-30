package com.gibsoncool.demo2

fun main(args: Array<String>) {

    var a = 10
    var b = 20
    var sum = 0 //a+b
    var result = 0 //a-b


    //只能cacl调用这个工具，其他不可以使用
    /**
     * 函数的参数定义出来之后，可以自动推断出类型，返回值不需要写，推断出当前返回值类型
     *
     * 匿名函数  lambda表达式
     */
    sum = cacl(a, b, { m: Int, n: Int -> m + n })       //第三个参数接受的是函数参数，所以用 ：：  传入函数的应用
    result = cacl(a, b, { m: Int, n: Int -> m - n })
    println("sum:$sum")
    println("result:$result")
}


fun cacl(a: Int, b: Int, block: (Int, Int) -> Int): Int {
    return block.invoke(a, b)
}