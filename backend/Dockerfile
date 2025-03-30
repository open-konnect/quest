# Use a lightweight Java 21 image
FROM eclipse-temurin:21-jdk-alpine

ARG PROJECT_NAME=quest-backend

# Set the working directory
WORKDIR /app

# Copy the built JAR file into the container
COPY build/libs/quest-backend-0.0.1.jar /app/build/app.jar
COPY docker-entrypoint docker-entrypoint

# /data is used for storing persistent data
VOLUME ["/data"]

# Expose the port your Spring Boot app runs on
EXPOSE 8080

# Command to run the application
RUN chmod +x /app/docker-entrypoint
CMD ["/app/docker-entrypoint"]

#ENTRYPOINT ["java", "-jar", "app.jar"]
