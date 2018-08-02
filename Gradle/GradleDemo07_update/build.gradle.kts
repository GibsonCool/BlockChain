plugins {
    application
}


//查看你的工作量，就是吧新怎文件写入到文件中
task("拷贝任务量") {
    inputs.dir("src")
    outputs.files("info.txt")

    doFirst {
        //获取src下的文件数
        val dir = fileTree("src")
        //接受文件infot.txt
        val infoText = File("info.txt")
        dir.forEach {
            if (it.isFile) {
//                infoText.writeText(it.name)  //覆盖的写法不适合
                Thread.sleep(1000L)
                infoText.appendText(it.name)
                infoText.appendText("\n")
            }
        }
    }
}