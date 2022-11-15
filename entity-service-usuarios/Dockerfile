FROM openjdk:8u151-slim
MAINTAINER Salvador Vite "salvador.vite@elektra.com.mx"
COPY /target/entity-service-usuarios-0.0.1.jar /opt/entity-service-usuarios-0.0.1.jar
EXPOSE 8084
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/opt/entity-service-usuarios-0.0.1.jar"]