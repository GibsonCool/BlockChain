package com.gibsoncool.demo.day01

fun main(args: Array<String>) {
    val path = "F:/BaiduYunDownload/day1"
    println(path.substring(0, 6))
    println(path.substring(0..5))
    println(path.substringBefore("o"))
    println(path.substringBeforeLast("o"))
    println(path.substringAfter("o"))
    println(path.substringAfterLast("o"))
}