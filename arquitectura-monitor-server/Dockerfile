FROM openjdk:8u151-slim
MAINTAINER Salvador Vite "salvador.vite@elektra.com.mx"
COPY /target/arquitectura-monitor-server-0.0.1.jar /opt/arquitectura-monitor-server-0.0.1.jar
EXPOSE 8090
ENTRYPOINT ["java", "-Djava.awt.headless=true", "-jar", "/opt/arquitectura-monitor-server-0.0.1.jar"]