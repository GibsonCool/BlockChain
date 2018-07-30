package com.gibsoncool.demo

/**
 * 8种基本数据乐行的数组可以通过arrayOf或者自己的数据类型Array（IntArray）创建
 * 字符串数组只能通过arrayOf创建
 *
 */
fun main(args: Array<String>) {
    val arrStr = arrayOf("张三", "李四", "王五")
    val arrAge = arrayOf(10, 3, 55)
    val arrChar = arrayOf('a', 'b', 'c')
    // Any 类似  java中的object
    val arr3 = arrayOf("张三", 10, 'a')


    val arr4 = IntArray(10) // java:  new int[10]


    //java: new int[]{30,30,30,30,30,30,30,30,30,30}
    val arr5 = IntArray(10) {
        30
    }


//    val arr6 = StringArray

    val arr7 = CharArray(2)
}