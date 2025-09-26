FROM eclipse-temurin:21-jdk-alpine
MAINTAINER wagdynavas.com
EXPOSE 8761
VOLUME /tmp
COPY target/*.jar discovery-service.jar
ENTRYPOINT ["java","-jar","/discovery-service.jar"]