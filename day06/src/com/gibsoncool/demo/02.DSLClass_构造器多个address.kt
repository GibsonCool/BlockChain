package com.gibsoncool.demoss

import com.gibsoncool.demosss.MYCLASS

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
        addresses {
            address {

                city = "深圳"
                street = "沙头街道"
                number = 114
            }

            address {
//                name = "8888"       //没有控制作用域在里层也能访问外层的字段
                city = "北京"
                street = "中关村"
                number = 133
            }
        }
    }

    /**
     * 现在address中的字段也无法修改了
     */
//    person.address?.city = "北京"
    println(person)

}

fun ArrayList<Address>.address(block: AddressBuilder.() -> Unit) {
    add(AddressBuilder().apply(block).build())
}


fun funPerson(block: PersonBuilder.() -> Unit): Person = PersonBuilder().apply(block).build()


fun PersonBuilder.addresses(block: MyList.() -> Unit) {
    this.address = MyList().apply(block)
}
@MYCLASS
class PersonBuilder {
    var name: String? = null
    var age: Int? = null
    var address: MyList? = null
    fun build(): Person = Person(name, age, address)
}

@MYCLASS
class AddressBuilder {
    var city: String? = null
    var street: String? = null
    var number: Int? = null
    fun build(): Address = Address(city, street, number)

}


data class Address(val city: String? = null, val street: String? = null, val number: Int? = null)

data class Person(val name: String? = null, val age: Int? = null, val addresses: MyList? = null)

@MYCLASS
class MyList:ArrayList<Address>()