package com.gibsoncool.demo


fun main(args: Array<String>) {

    val p1 = Person()
    p1.sayHelloTo("李四")
    p1 sayHelloTo "李四"

    //中缀操作符可以自定义操作符例如：区间 、元组
    var pair = Pair<String, Int>("ccc", 29)
    pair = "22" to 33


    p1 constomesTo 2
    p1.constomesTo(2)

}

/**
 * 中缀表达式使用条件 ：
 * 1、必须是成员函数或者是扩展函数，不能是顶层函数
 * 2、参数必须有且只有一个
 * 3、参数不能是默认参数或者是可变参数
 */
class Person {
    /**
     * 中缀表达式 infix 让代码更加简洁易懂  DSL
     */
    infix fun sayHelloTo(name: String): Unit {
        println("你好，$name")
    }


    infix fun <T> constomesTo(x: T) {
        println("constomes")
    }
}