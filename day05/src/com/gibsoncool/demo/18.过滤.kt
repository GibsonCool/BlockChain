package com.gibsoncool.demo

fun main(args: Array<String>) {
    val list = listOf("张三", "李四", "王五", "赵六", "张四", "李五", "李六")
    val list2 = listOf("周芷若", "张无忌", "张五", "李善长", "林青霞", "李寻欢")

    //    找到第一个姓张的
    println(list.find { it.startsWith("张") })
    println(list2.find { it.startsWith("张") })


    //    把第一个集合中所有姓张的找出来
    println(list.filter { it.startsWith("张") })
    println(list2.filter { it.startsWith("张") })

    //    把两个集合中所有姓张的找到并存放在同一个集合中
    println(filterToList(list, list2) { it.startsWith("张") })

    //    把第一个集合中角标为偶数的元素找出来
    println(list.filterIndexed { index, s -> index % 2 == 0 })
}

fun <E> filterToList(listA: List<E>, listB: List<E>, functionFilter: (E) -> Boolean): List<E> {
    var listResult = mutableListOf<E>()
    listA.filterTo(listResult, functionFilter)
    listB.filterTo(listResult, functionFilter)
    return listResult
}