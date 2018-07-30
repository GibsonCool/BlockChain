package com.gibsoncool.demo7

import com.gibsoncool.demo.ZhHuman

/**
 * kotlin接口里面字段不能具体实现，与java的接口不同
 */
fun main(args: Array<String>) {

    val xiaoMing = XiaoMing()
    xiaoMing.ride()
    xiaoMing.drive()
}

class XiaoMing : ZhHuman(), RideBike, DriveCar {
    override var licese: String = "123456789"

    override fun ride() {
        println("小敏学会了骑自行车")
    }

    override fun drive() {
        println("小明学会了开车")
    }
}


/**
 * 能力用接口表示
 */

//骑自行车
interface RideBike {
    fun ride()
}

//开车
interface DriveCar {
    //驾照号码
    /**
     * 此处的定义的字段实际反编译后是生成了这个字段对应的get/set接口方法
     * ，然后子类赋值是实际实现了这两个接口
     *      @NotNull
            String getLicese();

            void setLicese(@NotNull String var1);
     */
    var licese: String

    fun drive()
}