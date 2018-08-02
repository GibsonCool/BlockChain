//Project就是个接口
//gradle 构建的 时候，首先根据build.gradle 创建一个project实例，执行这个实例
//配置文件中所有的代码都会通过task任务的方式插入到project中
//project实例可以在配置文件中通过project隐式调用
project
project.group

//task任务  每一个操作都可以定义成一个任务，前面都application插件里面就已经打包好了好多任务，可以直接使用
task("编译java文件"){
    println("开始编译文件")
}