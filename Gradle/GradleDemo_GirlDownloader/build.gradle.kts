plugins {
    application
    kotlin("jvm")
}

//application {
//    mainClassName = "MainKt"
//}

repositories{
    mavenCentral()
}

dependencies{
    compile(kotlin("stdlib"))

    // https://mvnrepository.com/artifact/commons-httpclient/commons-httpclient
//    compile group: 'commons-httpclient', name: 'commons-httpclient', version: '3.1'
    compile("commons-httpclient","commons-httpclient","3.1")

}
