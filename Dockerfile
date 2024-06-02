FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/cicd-0.0.1-SNAPSHOT.jar cicd-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar","cicd-0.0.1-SNAPSHOT.jar"]