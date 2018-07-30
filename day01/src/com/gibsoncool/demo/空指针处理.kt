package com.gibsoncool.demo.day01

fun main(args: Array<String>) {
    //10   "10"
    //非空类型，不能赋值为null
//    val str:String = null

    //可为空类型  类型?
    val str:String? = null

    //强制告诉编译器不要检查空指针，明确知道自己不会为空，通常不建议使用: a!!
//    str!!.toInt()

    /*
    空安全操作符,类似:
    * if(str!=null)
    *   return str.toInt();
    * else
    *   return null;
    * */
    val toInt = str?.toInt()
    println(toInt)

    //返回值也是可为空类型  Int?
    val toInt2  = str?.toInt()
    println(toInt2)
    //返回值为非空类型  Int   采用Elvis操作符：  ?: 左边表达式非空，elvis操作符就会返回左边的结果，否则返回右边的结果。
    val toInt3  = str?.toInt()?:-1
    println(toInt3)
}