package com.gibsoncool.demo9


/**
 * //智能类型转换，当判断成立后，就不需要像java一样在强制转换一次
 */
fun main(args: Array<String>) {
    val shepHerdDog: Dog = ShepHerdDog()
    val ruralDog = RuralDog()

//    shepHerdDog.herdShep()  //调用失败父类没有这个方法
//    ruralDog.watchDog()
    if(shepHerdDog is ShepHerdDog){
//        val newDog = shepHerdDog as ShepHerdDog
//        newDog.herdShep()

        /**
         * 智能类型转换，当判断成立后，就不需要像java一样在强制转换一次
         */


        shepHerdDog.herdShep()
    }
}

abstract class Dog

//牧羊犬
class ShepHerdDog : Dog() {
    fun herdShep(): Unit {
        println("牧羊犬放养")
    }
}


//中华田园犬
class RuralDog : Dog() {
    fun watchDog(): Unit {
        println("中国田园犬看家")
    }
}

