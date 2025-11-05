# backend/Dockerfile
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/bookstore-1.0.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
