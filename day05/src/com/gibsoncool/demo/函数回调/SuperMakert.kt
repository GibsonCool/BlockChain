package com.gibsoncool.demo.函数回调

class SuperMakert {
    fun buySoy(feedBack: ((Soy) -> Unit)?) {
        Thread {
            Thread.sleep(5000)

            val soy = Soy("海天")
//            feedBack(soy)
            feedBack?.invoke(soy)
        }.start()
    }
}


class Soy(var name: String)