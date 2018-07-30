package com.gibsoncool.demo8

import com.gibsoncool.demo.ZhHuman

/**
 * kotlin接口里面字段不能具体实现，与java的接口不同
 * java接口里面的方法不能实现,kotlin可以直接实现其原理就是实现一个静态内部类并且实现同名方法
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

//    override fun drive() {
//        println("小明学会了开车")
//    }
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
    var licese: String


    /**
     * 反编译字节码实际是生成了一个接口的静态内部类，并实现了同样的方法
     * ，在子类调用的时候实际会调用到这个类里面来
     * public static final class DefaultImpls {
            public static void drive(DriveCar $this) {
                String var1 = "接口已经实现了开车方法";
                System.out.println(var1);
            }
        }
     */
    fun drive() {
        println("接口已经实现了开车方法")
    }
}