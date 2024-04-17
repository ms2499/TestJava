plugins {
    java
    id("com.github.johnrengelman.shadow") version "7.1.0"
}

group = "com.example"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
//  implementation(fileTree(mapOf("dir" to "lib", "include" to listOf("*.jar"))))
    implementation(fileTree(mapOf("dir" to "lib", "include" to listOf("*.jar"))))
    implementation("com.google.guava:guava:33.0.0-jre")
    implementation("org.dom4j:dom4j:2.1.4")
    implementation("org.apache.commons:commons-lang3:3.14.0")
//    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
//    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "com.example.testjava.TestJava"
        attributes["Class-Path"] = "/usr/tandem/jdbcMx/T1275L37/lib/jdbcMx.jar " +
                                   "/usr/tandem/javaexth11/lib/tdmext.jar" +
                                   "/java/sam/enslib/testLib.jar"
    }
}

tasks.shadowJar {
    archiveBaseName.set("TestJava")
    archiveClassifier.set("")
    archiveVersion.set("1.2")
    manifest {
        attributes["Main-Class"] = "com.example.testjava.TestJava"
        attributes["Class-Path"] = "/usr/tandem/jdbcMx/T1275L37/lib/jdbcMx.jar " +
                                   "/usr/tandem/javaexth11/lib/tdmext.jar " +
                                   "/java/sam/enslib/testLib.jar"
        exclude("jdbcMx.jar")
        exclude("tdmext.jar")
    }
}