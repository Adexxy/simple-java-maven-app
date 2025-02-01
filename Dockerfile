# 🚀 Stage 1: Build Stage (Uses Maven to compile & package)
FROM maven:3.9.6-eclipse-temurin-17 AS builder

WORKDIR /app

# Copy project files and dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the source code
COPY . .

# Build the application
RUN mvn clean package -DskipTests



# 🚀 Stage 2: Runtime Stage (Uses smaller JDK runtime)
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy the JAR file from the builder stage
COPY --from=builder /app/target/*.jar app.jar

# Expose the application's port (default Spring Boot port)
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
