plugins {
    id("com.example.grpc.kotlin-application-conventions")
}

dependencies {
    implementation(project(":protobuf"))
    runtimeOnly(libs.grpc.netty)
}

application {
    // Define the main class for the application.
    mainClass.set("com.example.grpc.echo.EchoClientKt")
}
