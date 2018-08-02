package com.gibsoncool.democ

fun main(args: Array<String>) {
//    val html = Tag("html")
//    val head = Tag("head")
    val html = Html()
    val head = Head()
    val body = Body()
    val div = Div()

    //先放入head
    html.setTag(head)
    //div放到body中
    body.setTag(div)
    //body放到html中
    html.setTag(body)
    println(html)

    val result: Html = html {
        head {

        }
        body {
            div {

                //可以访问最外面的HTML作用域，应严格限制作用域
//                body {
//
//                }
            }
        }
    }
    println(result)
}

//div高阶函数
fun Body.div(function: () -> Unit) {
    val div = Div()
    setTag(div)
}


//body高阶函数
fun Html.body(function: Body.() -> Unit) {
    val body = Body()
    body.function()
    setTag(body)
}


//head高阶函数
fun Html.head(function: () -> Unit) {
    //创建一个head标签，并添加到html中
    val head = Head()
    setTag(head)
}


//html标签
fun html(function: Html.() -> Unit): Html {
    val html = Html()
    html.function()
    return html
}

class Html : Tag("html")
class Head : Tag("head")
class Body : Tag("body")
class Div : Tag("div")

@MYTAG
open class Tag(var name: String) {

    var list = ArrayList<Tag>()

    fun setTag(tag: Tag) {
        list.add(tag)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("<$name>")
        list.forEach {
            sb.append(it.toString())
        }
        sb.append("</$name>")
        return sb.toString()
    }
}

@DslMarker
annotation class MYTAG