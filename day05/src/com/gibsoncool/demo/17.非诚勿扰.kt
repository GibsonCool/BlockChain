package com.gibsoncool.demo

data class Girl(var name: String, var age: Int, var heigh: Int, var place: String)

val list =
        listOf(Girl("依儿", 18, 168, "山东"),
                Girl("笑笑", 19, 175, "河南"),
                Girl("小百合", 17, 155, "福建"),
                Girl("michel", 22, 148, "广东"),
                Girl("猫咪", 28, 159, "广西"),
                Girl("玲儿", 23, 169, "广东"),
                Girl("环环", 25, 172, "安徽"),
                Girl("胖嘟嘟", 32, 180, "河北"),
                Girl("乔乔", 35, 180, "广东"),
                Girl("小可爱", 27, 150, "江西"),
                Girl("一生有你", 22, 163, "山东"),
                Girl("敏儿", 28, 155, "黑龙江"),
                Girl("月儿", 25, 178, "吉林"),
                Girl("花儿", 21, 183, "山东"),
                Girl("S小糖", 49, 190, "新疆"),
                Girl("悦悦", 19, 160, "广西"),
                Girl("小可爱", 29, 158, "广东"),
                Girl("紫琪", 49, 149, "新疆"),
                Girl("糖心", 26, 165, "甘肃"),
                Girl("棒棒糖", 23, 172, "浙江"),
                Girl("猪猪侠", 18, 173, "山东"),
                Girl("喵喵", 27, 164, "河南"),
                Girl("安琦", 19, 159, "河北"),
                Girl("叶子", 20, 160, "广东"))

fun main(args: Array<String>) {
    //男嘉宾：河南的只想找河南的
    var list1 = ArrayList<Girl>()
    list.forEach {
        if (it.place == "河南")
            list1.add(it)
    }
    println(list1)

    /**
     * filter 接受一个函数参数 predicate: (T) -> Boolean, 返回一个函数Iterable<T>.filterTo,该函数返回一个List
     * filterTo接受一个集合和一个函数参数：filter-->filterTo(ArrayList<T>(),predicate)
     *
     */
    val filter = list.filter { it.place == "河南" }
    println(filter)

    val filter1 = list.filter { it.age < 30 }
    println(filter1)

    val filter2 = list.filter { it.place == "广东" && it.heigh >= 162 && it.age < 25 }
    println(filter2)

    val filter3 = list.filter { it.place == "广东" && it.heigh > 160 && it.age > 35 }
    println(filter3)

}