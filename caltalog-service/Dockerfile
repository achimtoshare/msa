FROM openjdk:17-ea-11-jdk-slim
VOLUME /tmp
COPY target/caltalog-service-1.0.jar CaltalogService.jar
ENTRYPOINT ["java","-jar","CaltalogService.jar"]