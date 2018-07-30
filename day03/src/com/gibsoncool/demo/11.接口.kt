package com.gibsoncool.demo

fun main(args: Array<String>) {

    val xiaoMing = XiaoMing()
    xiaoMing.ride()
    xiaoMing.drive()
}

class XiaoMing : ZhHuman(), RideBike, DriveCar {
    override fun ride() {
        println("小敏学会了骑自行车")
    }

    override fun drive() {
        println("小明学会了开车")
    }
}


//能力用接口表示
interface RideBike {
    fun ride()
}

interface DriveCar {
    fun drive()
}