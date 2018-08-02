//插件 定义了很多可执行的任务


//gradle自动插件  application
//plugins {
////    application   //支持发布应用程序
////    java    //没有发布作用，只能构建java项目
////    war
//    kotlin("jvm")
//
//}


//第三方公司或者个人开发了很多的插件，可以使用，需要到gradle官方插件市场查找
//buildscript {
//    repositories {
//        maven {
//            setUrl("https://plugins.gradle.org/m2/")
//        }
//    }
//    dependencies {
//        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.2.60")
//    }
//}
//
////apply plugin: "org.jetbrains.kotlin.jvm"
//apply{
//    plugin("org.jetbrains.kotlin.jvm")
//}

plugins {
    id ("org.jetbrains.kotlin.jvm") version "1.2.60"
}


/**
 * gradle 的插件使用方式
 * plugins{  }
 *
 *
 *
 * 插件市场的使用方式
 *
 * 可以通过plugins{}   或者 apply{}两种方式
 */
//
