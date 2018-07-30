package com.gibsoncool.demo6

fun main(args: Array<String>) {
    val p = Person()
    println(p.age)
    println(Person.name)    //  实际访问的是: Person.Companion.getName()
}


class Person {
    var age = 20

    /**
     * 实现原理：
     * 1、name 字段会成为 Person 的静态字段、static修饰
     * 2、同时会生成一个Person静态内部类Companion，对应Person里面的Companion静态常量字段即：
     *           public static final Person.Companion Companion = new Person.Companion((DefaultConstructorMarker)null);
     * 3、在Companion中定义了静态字段name的get/set方法
     */
    companion object {
        //静态字段
        var name = "张珊"
    }
}