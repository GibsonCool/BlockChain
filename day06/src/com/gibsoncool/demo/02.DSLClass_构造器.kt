package com.gibsoncool.demos

/**
 * 问题：name/age 字段可以被赋值多次。。希望只能赋值一次
 * val修饰后  ，创建Person是不能传递字段，就需要默认值null，设置了默认值后面就不能赋值了
 * 创建person的时候就需要传递字段，那就在创建之前进行赋值操作，将person创建放到赋值完之后在创建：延迟创建（创建者模式例如：Dialog.Builder  Okhttp.Builder）
 *
 *
 */
fun main(args: Array<String>) {

    val person = funPerson {
        name = "GibsonCool"
        age = 22
        name = "张是哪"
        address {
            city = "深圳"
            street = "沙头街道"
            number = 114
        }
    }
    /**
     * 此处编译不通过  name/age/address字段都是val 修饰了，只能在调用funPerson中重复赋值，
     * 然后PersonBuilder进行创建，创建后就无法在赋值了。
     */
//    person.name = "hah"
//    person.address = Address()

    /**
     * address字段不可以修改，但是address对象中的字段可以修改，因为address构造函数中的字段是var 修饰的
     */
    person.address?.city = "北京"

    println(person)

}


fun funPerson(block: PersonBuilder.() -> Unit): Person = PersonBuilder().apply(block).build()


fun PersonBuilder.address(block: Address.() -> Unit) {
    this.address = Address().apply(block)
}

class PersonBuilder {
    var name: String? = null
    var age: Int? = null
    var address: Address? = null
    fun build(): Person = Person(name, age, address)
}


data class Address(var city: String? = null, var street: String? = null, var number: Int? = null)

data class Person(val name: String? = null, val age: Int? = null, val address: Address? = null)
