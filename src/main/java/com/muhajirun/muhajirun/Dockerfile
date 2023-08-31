FROM ubuntu:latest AS build
RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .
RUN ./mvnw bootJar --no-daemon

FROM openjdk:17-jdk-slim
EXPOSE 1995
COPY --from-buid /build/libs/demo-1.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]