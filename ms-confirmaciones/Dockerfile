FROM openjdk:8u151-slim
MAINTAINER Salvador Vite "salvador.vite@elektra.com.mx"
COPY /target/ms-confirmaciones-0.0.1.jar /opt/ms-confirmaciones-0.0.1.jar
EXPOSE 8082
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/opt/ms-confirmaciones-0.0.1.jar"]