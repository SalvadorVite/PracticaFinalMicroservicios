FROM openjdk:8u151-slim
MAINTAINER Salvador Vite "salvador.vite@elektra.com.mx"
COPY /target/ms-solicitudes-0.0.1.jar /opt/ms-solicitudes-0.0.1.jar
EXPOSE 8085
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/opt/ms-solicitudes-0.0.1.jar"]