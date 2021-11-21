FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY rest-demo/target/rest-demo-0.0.1-SNAPSHOT.jar /app/
ENTRYPOINT ["java", "-jar", "/app/rest-demo-0.0.1-SNAPSHOT.jar"]