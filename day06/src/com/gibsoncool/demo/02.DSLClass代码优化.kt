package com.gibsoncool.demo3


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
    println(person)

}


fun funPerson(block: Person.() -> Unit) = Person().apply(block)


fun Person.address(block: Address.() -> Unit) {
    this.address = Address().apply(block)
}


data class Person(var name: String? = null, var age: Int? = null, var address: Address? = null)
data class Address(var city: String? = null, var street: String? = null, var number: Int? = null)