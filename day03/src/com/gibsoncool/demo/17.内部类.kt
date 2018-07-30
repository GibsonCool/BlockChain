package com.gibsoncool.demo.hh

/**
 * kotlin内部类与java内部类一样，需要依赖外部类对象
 * 需要使用 inner关键字显示申明为嵌套类为内部类否则就是静态类
 */
fun main(args: Array<String>) {

    //创建爱你嵌套类对象
    val innerClass = OutClass().InnerClass()
    innerClass.sayHello()
}

class OutClass{
    var name = "张三"
    inner class InnerClass{
        fun sayHello(){
            println("张三$name")
        }
    }
}