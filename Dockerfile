FROM openjdk:8-jdk-alpine
COPY target/rest-demo-0.0.1-SNAPSHOT.jar rest-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "rest-demo-0.0.1-SNAPSHOT.jar"]