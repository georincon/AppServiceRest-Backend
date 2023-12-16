FROM amazoncorretto:11-alpine-jdk
MAINTAINER GEORINCON
COPY target/ServicioRest-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]