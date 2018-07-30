package com.gibsoncool.demo1


/**
 * 只有尾递归（函数在调用自身只有没有执行其他任何的操作）才能优化
 */
fun main(args: Array<String>) {
    //求1到n的数据和

    println(sum2(10))
    println(sum3(100000))
}


/**
 * 递归方式
 */
fun sum2(n: Int): Int {
    if (n == 0) {
        return 1
    } else {
        return n + sum2(n - 1)     //调用自身之后做了其他操作+n
    }
}

tailrec fun sum3(n: Int, result: Int = 0): Int {
    if (n == 0) {
        return result + 1
    } else {
        return sum3(n - 1, result + n)     //调用自身之后做了其他操作+n
    }
}