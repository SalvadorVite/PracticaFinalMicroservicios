FROM openjdk:8u151-slim
MAINTAINER Salvador Vite "salvador.vite@elektra.com.mx"
COPY /target/discovery-server-0.0.1.jar /opt/discovery-server-0.0.1.jar
EXPOSE 8761
ENTRYPOINT ["java", "-Djava.awt.headless=true", "-jar", "/opt/discovery-server-0.0.1.jar"]