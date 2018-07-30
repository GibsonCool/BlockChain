package com.gibsoncool.demo

import java.util.*

fun main(args: Array<String>) {
    /*--------------------setOf-----------------------*/
    val set1 = setOf("吴彦祖", "陈冠希", "阮经天", "陈冠希")
//    set1.add("cxx")
    println(set1)

    /*--------------------setOf-----------------------*/
    val set2 = mutableSetOf("吴彦祖", "陈冠希", "阮经天", "陈冠希")
    set2.add("cxx")
    println(set2)
    set2.remove("陈冠希")
    println(set2)

    /*--------------------java集合方式-----------------------*/
    val hashSetOf = hashSetOf<String>()
    val treeSet = TreeSet<String>()
    treeSet.add("z")
    treeSet.add("f")
    treeSet.add("e")
    treeSet.add("a")

    println(treeSet)

    val treeSet2 = TreeSet<Person>()
    treeSet2.add(Person("林青霞", 20))
    treeSet2.add(Person("张曼玉", 30))
    treeSet2.add(Person("张三", 60))
    println(treeSet2)


}

class Person(val name: String, var age: Int) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return if (this.equals(other)) 0 else -1
    }

    override fun toString(): String {
        return "name:$name,age:$age"
    }
}


