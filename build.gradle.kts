
plugins {
    kotlin("jvm") version("1.3.61")
    id("org.jetbrains.dokka") version("0.10.0")
}

group = "kotlinlang.library"
version = "0.0.1"

tasks.dokka {
    outputFormat = "html"
    outputDirectory = "$buildDir/javadoc"
}

val dokkaJar by tasks.creating(Jar::class) {
    group = JavaBasePlugin.DOCUMENTATION_GROUP
    description = "Assembles Kotlin docs with Dokka"
    archiveClassifier.set("javadoc")
    from(tasks.dokka)
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib", "1.2.31"))
    testImplementation("junit:junit:4.12")
}
