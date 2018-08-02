tasks {
    "open_door"{
        group = "大象冰箱"      //对任务分组,组名为“大象冰箱”
        doFirst {
            println("打开冰箱")
        }
    }

    "put_elephant"{
        group = "大象冰箱"
        doFirst {
            println("放入大象")
        }
    }.dependsOn("open_door")


    "close_door"{
        group = "大象冰箱"
        doFirst {
            println("关闭冰箱")
        }
    }.dependsOn("put_elephant")
}