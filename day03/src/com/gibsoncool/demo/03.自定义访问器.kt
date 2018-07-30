package com.gibsoncool.demo1

fun main(args: Array<String>) {
    val p = Person()
    p.age = 20
}

class Person {
    var name = "张三"
        private set//私有了set方法 ,外部不能修改，内部可以修改
    var age = 10

        set(value) {
            if (value > 150) {
//                this.age=150  //会导致递归调用栈溢出
                field = value
            }
        }
}