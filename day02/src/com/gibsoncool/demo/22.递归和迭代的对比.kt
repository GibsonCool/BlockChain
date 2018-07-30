package com.gibsoncool.demo

fun main(args: Array<String>) {
    //求1到n的数据和
    println(sum1(10))
    println(sum2(10))
}

/**
 * 通过迭代的方式求和
 */
fun sum1(n: Int): Int {
    var result = 0
    var copyN = n
    while (copyN > 0) {
        result += copyN
        copyN--
    }
    return result
}

/**
 * 递归方式
 */
fun sum2(n: Int):Int{
    if(n==0){
        return 1
    }else{
        return n+ sum2(n-1)
    }
}