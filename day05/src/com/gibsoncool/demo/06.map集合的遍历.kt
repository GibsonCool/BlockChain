package com.gibsoncool.demo

fun main(args: Array<String>) {
    val mapOf = mapOf("中国" to "China", "美国" to "USA", "英国" to "England")
    val keys = mapOf.keys
    val values = mapOf.values
    val entries = mapOf.entries
    keys.forEach {
        println("$it,$mapOf[it]")
        println(mapOf[it])
    }

    entries.forEach {
        println("${it.key},${it.value}")
    }

    mapOf.forEach { key, value ->
        println("key:$key,value:$value")
    }

    for (entry in mapOf) {

    }

    for ((entKey, entValu) in mapOf) {
        println("entkey:$entKey,entValue:$entValu")
    }
}