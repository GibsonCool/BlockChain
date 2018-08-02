/**
 * doFirst/doLast 控制其中的逻辑在task生命周期中执行，不会在扫描生命周期中就执行
 * 两个同事存在doFirst在任务执行周期中先执行，然后在执行doLast
 */

task("关闭冰箱") {
    doLast {
        println("do last close door")
    }

    doFirst {
        println("do first ")
    }

}.dependsOn("装大象")


task("打开冰箱") {
    doFirst {
        println("open door")
    }
}

//使用dependsOn依赖于打开冰箱这个任务
task("装大象") {
    println("put elephant")

}.dependsOn("打开冰箱")