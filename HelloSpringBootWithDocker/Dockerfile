FROM openjdk:8-jdk-alpine
VOLUME /temp
ADD target/app.jar app1.jar
ENTRYPOINT ["java","-jar","/app1.jar"]