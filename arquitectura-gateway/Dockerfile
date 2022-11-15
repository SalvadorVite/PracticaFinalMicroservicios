FROM openjdk:8u151-slim
MAINTAINER Salvador Vite "salvador.vite@elektra.com.mx"
COPY /target/arquitectura-gateway-0.0.1.jar /opt/arquitectura-gateway-0.0.1.jar
EXPOSE 8766
ENTRYPOINT ["java", "-Djava.awt.headless=true", "-Xms256m", "-Xmx256m", "-jar", "/opt/arquitectura-gateway-0.0.1.jar"]