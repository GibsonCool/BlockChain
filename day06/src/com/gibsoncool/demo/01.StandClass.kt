package com.gibsoncool.demo

fun main(args: Array<String>) {

    val address = Address("深圳市", "沙头街道", 20)
    val person = Person("gibson", 23, address)

//    Person {
//        name = "gibson"
//        age = 20
//        address {
//            city = "深圳"
//            street = "沙头街道"
//            number = 33
//        }
//    }

}


class Person(var name: String, var age: Int, var address: Address)
class Address(var city: String, var street: String, var number: Int)