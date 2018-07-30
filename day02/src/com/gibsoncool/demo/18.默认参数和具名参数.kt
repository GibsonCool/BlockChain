package com.gibsoncool.demo

fun main(args: Array<String>) {

    sendRequest("www.baidu.com", "get")
    sendRequest("www.bilibili.com")
    sendRequest(method = "Post", path = "www.path.com") //具名参数
}

fun sendRequest(path: String, method: String = "GET") {
    println("请求路径=$path,method=$method")
}