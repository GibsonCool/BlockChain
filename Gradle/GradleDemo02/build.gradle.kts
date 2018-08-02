plugins {
    application
    kotlin("jvm")   //支持kotlin jvm
}

application {
    mainClassName = "MainKt"
}

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib"))
}