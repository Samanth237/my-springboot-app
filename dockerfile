# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY build/libs/app.jar app.jar

# Expose the application port (change if your app runs on a different port)
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
