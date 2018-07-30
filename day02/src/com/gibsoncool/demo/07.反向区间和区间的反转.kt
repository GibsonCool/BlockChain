package com.gibsoncool.demo

fun main(args: Array<String>) {
    //定义100-1
//    val range = 100 .. 1          /* .. 的形式只能定义正向的区间 */

    /*--------------反向区间定义使用  downTo-----------------------------*/
    val range = 5 downTo 1
    range.forEach {
        println(it)
    }

    /*--------------区间的反转  区间.reversed()-----------------------------*/
    val range2 =  1..100
    val range3 = range2.reversed()
    for (i in range3 step 10) {
        println("i=$i")
    }
}