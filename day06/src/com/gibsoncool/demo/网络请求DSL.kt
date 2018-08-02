package com.itcast.dsl.网络请求

import java.util.*


fun main(args: Array<String>) {


    http {
        path = "www.baidu.com"
        method = "get"
        onsuccess {
            println("onSuccess:$it")
        }
        onError {
            println("onError:$it")
        }
    }
}

fun http(block: MyRequest.() -> Unit) = MyRequest().apply(block).send()

fun MyRequest.onsuccess(block: (String) -> Unit) {
    onsuccess = block
}

fun MyRequest.onError(block: (String) -> Unit) {
    onsuccess = block
}

/**
 * http{} 实际需要的效果相当于执行了HttpUtil().sendRequest()
 * http{} 调用的时候参数是不确定的，需要后面传递
 * 需要使用构建者模式来创建
 */
class MyRequest(var path: String? = null, var method: String? = null, var onsuccess: ((String) -> Unit)? = null, var onError: ((String) -> Unit)? = null) {
    //发送请求的方法,需要HttpUtil对象，并调用起sendRequest
    fun send() {
        val httpUtil = HttpUtil()
        httpUtil.sendRequest(path, method, onsuccess, onError)
    }

//    fun onError(function: (String) -> Unit) {
//        onError = function
//    }

}

class HttpUtil {
    interface CallBack {
        fun onSuccess(result: String)
        fun onError(e: String)
    }

    fun sendRequest(path: String?, method: String?, onsuccess: ((String) -> Unit)?, onError: ((String) -> Unit)?) {
        println("pth=$path method=$method")
        Thread {
            //创建URL
//            val url = URL(path)
            println("创建URL")

            //打开网络连接
//            val conn = url.openConnection() as HttpURLConnection
            println("打开网络连接")

            //获取响应码
//            val resCode = conn.responseCode

            val code = Random().nextInt(100)
            println("获取响应码")

            if (code % 2 == 0) {
                onsuccess?.invoke("结果正确了")
            } else {
                onError?.invoke("响应码不正确")
            }
        }.start()
    }
}