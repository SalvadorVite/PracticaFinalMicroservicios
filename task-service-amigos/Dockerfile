FROM openjdk:8u151-slim
MAINTAINER Salvador Vite "salvador.vite@elektra.com.mx"
COPY /target/task-service-amigos-0.0.1.jar /opt/task-service-amigos-0.0.1.jar
EXPOSE 8083
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/opt/task-service-amigos-0.0.1.jar"]