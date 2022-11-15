FROM openjdk:8u151-slim
MAINTAINER Salvador Vite "salvador.vite@elektra.com.mx"
COPY /target/entity-service-posts-0.0.1.jar /opt/entity-service-posts-0.0.1.jar
EXPOSE 8086
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/opt/entity-service-posts-0.0.1.jar"]