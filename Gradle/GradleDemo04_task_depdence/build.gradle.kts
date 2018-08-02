task("打开冰箱") {

}

//使用dependsOn依赖于打开冰箱这个任务
task("装大象") {

}.dependsOn("打开冰箱")

task("关闭冰箱") {}.dependsOn("装大象")
