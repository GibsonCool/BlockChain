package com.gibsoncool.demo

/**
 * kotlin嵌套类是属于静态类static修饰，与外部类无任何关系。与java不一样
 */
fun main(args: Array<String>) {

    //创建爱你嵌套类对象
    val innerClass = OutClass.InnerClass()
}

class OutClass{
    var name = "张三"
    class InnerClass{
        fun sayHello(){
//            println("张三$name")
        }
    }
}