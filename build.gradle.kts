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
    implementation("org.projectlombok:lombok:1.18.30")
    compileOnly("org.projectlombok:lombok")
//    annotationProcessor("org.projectlombok:lombok")
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
                                   "/java/sam/enslib/enslib.jar"
    }
}

tasks.shadowJar {
    archiveBaseName.set("TestJava")
    archiveClassifier.set("")
    archiveVersion.set("1.4")
    manifest {
        attributes["Main-Class"] = "com.example.testjava.TestJava"
        attributes["Class-Path"] = "/usr/tandem/jdbcMx/T1275L37/lib/jdbcMx.jar " +
                                   "/usr/tandem/javaexth11/lib/tdmext.jar " +
                                   "/java/sam/enslib/enslib.jar " +
                                   "/java/sam/TestJava-1.4.jar"
        exclude("jdbcMx.jar")
        exclude("tdmext.jar")
        exclude("enslib.jar")
    }
}
