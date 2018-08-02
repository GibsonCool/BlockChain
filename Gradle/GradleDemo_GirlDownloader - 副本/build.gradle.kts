plugins {
    application
    kotlin("jvm")
}

//application {
//    mainClassName = "MainKt"
//}

//repositories:代码资料库（仓库）
/**
 * 常见仓库:
 * mavenCentral
 * Jcenter
 * Local本地仓库(网络下载后放到C:\Users\Administrator\.gradle\caches\modules-2)缓存目录
 * 文件仓库
 * 自定义maven仓库
 */
repositories{
    mavenCentral()
}

dependencies{
    compile(kotlin("stdlib"))

    // https://mvnrepository.com/artifact/commons-httpclient/commons-httpclient
//    compile group: 'commons-httpclient', name: 'commons-httpclient', version: '3.1'
    compile("commons-httpclient","commons-httpclient","3.1")

}
