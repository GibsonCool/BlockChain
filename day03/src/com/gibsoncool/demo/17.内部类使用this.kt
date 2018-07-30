package com.gibsoncool.demo.hh1

/**
 * kotlin内部类与java内部类一样，需要依赖外部类对象
 * 需要使用 inner关键字显示申明为嵌套类为内部类否则就是静态类
 * kotlin中的this@tagclass 和java里面的outclass.this.一样
 */
fun main(args: Array<String>) {

    //创建爱你嵌套类对象
    val innerClass = OutClass().InnerClass()
    println(innerClass.name)
    innerClass.sayHello()
    innerClass.sayOutHello()
}

class OutClass {
    var name = "张三"

    inner class InnerClass {
        var name = "李四"
        fun sayHello() {
            println("hello$name")
        }
        fun sayOutHello(){
            println(this@OutClass.name)
        }
    }
}