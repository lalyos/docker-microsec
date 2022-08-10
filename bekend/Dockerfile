# syntax=docker/dockerfile:1.2
FROM eclipse-temurin:11-jdk

RUN mkdir -p /app/.mvn/wrapper/
COPY pom.xml mvnw /app/
COPY .mvn/wrapper/maven-wrapper.jar  .mvn/wrapper/maven-wrapper.properties /app/.mvn/wrapper/

WORKDIR /app
RUN --mount=type=cache,target=/root/.m2 ./mvnw dependency:resolve

COPY . /app
RUN --mount=type=cache,target=/root/.m2 ./mvnw package -DskipTests

CMD [ "java",  "-jar", "/app/target/bekend-0.0.1-SNAPSHOT.jar" ]