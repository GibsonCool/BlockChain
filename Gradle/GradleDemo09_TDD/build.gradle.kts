plugins {
    application
    kotlin("jvm")
}
application {
    mainClassName = "MainKt"
}


//指定仓库
repositories {
    mavenCentral()
}


dependencies {
    compile(kotlin("stdlib"))
    // https://mvnrepository.com/artifact/junit/junit
//    testCompile group: 'junit', name: 'junit', version: '4.12'
    /**
     * 使用 testCompile依赖的发布的时候是不会加入依赖的
     */
    testCompile("junit:junit:4.12")
}