allprojects {

    repositories {
        mavenCentral()
    }

    group = "com.github.gmazzo"

    plugins.withType<JavaPlugin> {
        dependencies {
            "testImplementation"("junit:junit:4.12")
            "testImplementation"("org.mockito:mockito-core:2.27.0")
        }
    }

}
