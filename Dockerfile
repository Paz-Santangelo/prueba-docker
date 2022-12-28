FROM amazoncorretto:17-alpine-jdk
MAINTAINER emaaristimuno
COPY target/prueba-0.0.1-SNAPSHOT.jar prueba-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/prueba-0.0.1-SNAPSHOT.jar"]