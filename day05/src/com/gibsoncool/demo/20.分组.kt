package com.gibsoncool.demo

fun main(args: Array<String>) {
    val list = listOf("张三", "李四", "王五", "赵六", "张四", "李五", "李六")
    val list2 = listOf("周芷若", "张无忌", "张五", "李善长", "林青霞", "李寻欢")

    //姓张的一组，姓李的一组，其他的一组
    val groupBy = list.groupBy {
        val first = it.substring(0, 1)
        when (first) {
            "张" -> "张氏"
            "李" -> "李氏"
            else -> "其他"
        }
    }

}