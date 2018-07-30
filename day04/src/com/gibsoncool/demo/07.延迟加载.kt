package com.gibsoncool.demo5

/**
 * lateinit  延迟加载，用的时候在赋值，不赋值不能用 防止程序错误处理
 */

lateinit var name: String

fun main(args: Array<String>) {
    val p = Person()
//    p.name="cxx"  //不调用赋值操作就会报错
//    println(p.name)
    println(name)
}

class Person {
    // 不确定
    lateinit var name: String

}

/**
 *  by lazy 和 lateinit 都可以单独是用户总和放到成员变量中使用
 *  by lazy 知道具体复制操作，只是到用的时候在加载赋值,返回值都是 最后一行
 *  lateinit 不知道具体复制，需要手动复制
 *  by lazy字段：val    lateinit字段：var
 */