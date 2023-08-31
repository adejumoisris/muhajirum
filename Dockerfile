# define base docker image
FROM openjdk:17
LABEL maintainer="idris"
ADD target/muhajirun-1.jar muhajirun.jar
ENTRYPOINT ["java", "-jar", "muhajirun.jar "]