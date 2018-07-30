package com.gibsoncool.demo

import java.util.*


fun main(args: Array<String>) {

    /*--------------------listOf-----------------------*/
    //此方式创建的list 不能添加、不能修改元素，只读集合
    val list = listOf("吴彦祖", "陈冠希", "阮经天")
//    list[2] = "haha"
    println(list[2])

    list.forEach {
        println(it)
    }


    /*--------------------mutableListOf-----------------------*/
    //mutableListOf最总返回的也是个ArrayList
    val list2 = mutableListOf("吴彦祖", "陈冠希", "阮经天")
    println(list2)
    //修改第一个元素
    list2[0] = "彭于晏"
    println(list2)
    // 添加一个元素
    list2.add(1,"黄渤")
    println(list2)


    /*--------------------java集合-----------------------*/
    val list3 = arrayListOf("吴彦祖", "陈冠希", "阮经天")
    val list4 = ArrayList<String>()
    val list5 = Vector<String>()


}