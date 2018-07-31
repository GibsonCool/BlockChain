package com.gibsoncool.demo

/**
 * 待接收的函数参数，内部调用的两种方式
 * T.()->Unit
 * lambda表达式相当于定义在T对象里面的函数，因此可以方位对象里面的字段和方法
 *
 */
fun set(block: Data.() -> Unit) {
    Data().block()
    block(Data())
}


class Data {
    var name = "张珊"

    fun sayHellow(): Unit {
        println("hellow")
    }

}


fun main(args: Array<String>) {
    set {
        println(name)
        sayHellow()
    }


    val list: ArrayList<String> = arrayListOf("林青霞", "范冰冰", "柳岩")

//    list?.add("刘诗诗")
//    list?.add("李四")
//    list?.add("王五")

    /*-----------------apply----------------------*/
    /**
     * 任意类型都有apply扩展函数
     * apply函数的接受一个函数参数： T.()->Unit    这是一个带接受者的函数字面值
     * labmda表达式this代表调用的对象
     * lambda表达式里面可以访问对象的方法：因为带有接受者的函数参数，表达式就相当于定义在接受者内部，所以可以访问内部对象的属性和方法
     * apply返回值就是调用者本身
     */
//    list.apply {
//        this?.add("刘诗诗")
//        this?.add("李四")
//        this?.add("王五")
//    }

    list?.apply {
        this.add("刘诗诗")
        this.add("李四")
        this.add("王五")
    }?.forEach {
        println(it)
    }


    /*-----------------let----------------------*/
    /**
     * 任意对象都有let函数
     * let函数参数也是一个函数参数，
     * 函数参数的参数是调用者本身
     * let函数的返回值就是函数参数的返回值
     */
    println(list?.let {
        var str = ""
        it.forEach {
            str += it + "--"
        }
        str
    })

    /*-----------------with----------------------*/
    /**
     * with是一个独立的函数，，可以任意地方调用
     * with函数要接受两个参数
     * 第一个参数是任何类型参数
     * 第二个参数是函数参数，这个函数参数是一个带接受者的函数字面值，接受者就是第一个参数
     * with函数返回值是第二个函数参数的返回值
     * 相当于apply和let的结合，可以通过this访问第一个参数的值，返回的是第二个函数参数返回的值
     *
     */
    with(list){
        this.add("")
        this.add("")
        add("")
      "haha"
    }.length


    /*-----------------run----------------------*/
    /**
     * 任意类型都有run这个扩展函数
     * run函数的参数是一个带接受者的函数函数，接受者就是调用者本身
     * run函数的返回值就是当前函数参数的返回值
     *
     */
    list.run {
        this.add("haha")
        "haha"
    }.length
}


