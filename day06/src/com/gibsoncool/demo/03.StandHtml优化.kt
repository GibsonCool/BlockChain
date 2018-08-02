package com.gibsoncool.demo4


fun main(args: Array<String>) {


    val result: Html = html {
        head {

        }
        body {
            div {

            }
        }
    }
    println(result)
}

//div高阶函数
fun Body.div(function: () -> Unit) = setTag(Div())


//body高阶函数
fun Html.body(function: Body.() -> Unit) = setTag(Body().apply(function))


//head高阶函数
fun Html.head(function: () -> Unit) = setTag(Head())


//html标签
fun html(function: Html.() -> Unit): Html = Html().apply(function)

class Html : Tag("html")
class Head : Tag("head")
class Body : Tag("body")
class Div : Tag("div")


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