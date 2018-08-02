package com.gibsoncool.demo2


fun main(args: Array<String>) {

    val person = funPerson {
        name = "GibsonCool"
        age = 22
        address {
            city = "深圳"
            street = "沙头街道"
            number = 114
        }
    }
    person.name = "haha"
    println(person)

}

//    Person {
//        name = "gibson"
//        age = 20
//        address {
//            city = "深圳"
//            street = "沙头街道"
//            number = 33
//        }
//    }


//普通函数，接受一个函数参数
/**
 * 第一步：
 * 函数确认是返回一个Person对象
 * 函数参数可能有一个参数  先不写
 * 函数参数可能有返回值先不写
 */
//fun funPerson(block: () -> Unit): Person {
//    val person =  Person()  //创建的时候不能传参数，需要通过里面的DSL获取
//    return person
//}

/**
 * 第二步：
 * 实现Name属性可以添加个person的person对象，接受者为Person对象的函数参数
 */
fun funPerson(block: Person.() -> Unit): Person {
    val person = Person()
    /**
     * 第三步执行block函数
     */
//    block(person)
    person.block()
    return person
}


/**
 * 第四步：address高阶函数
 */
//fun address(block:() -> Unit) {
//    //创建一个Address对象
//    val address = Address()
//}
/**
 * 第五步：赋值给Person对象的address
 * 相当于在Person里面又定义了一个address扩展函数
 */
fun Person.address(block: Address.() -> Unit) {
    //创建一个Address对象
    val address = Address()
    address.block()
    this.address = address
}


data class Person(var name: String? = null, var age: Int? = null, var address: Address? = null)
data class Address(var city: String? = null, var street: String? = null, var number: Int? = null)