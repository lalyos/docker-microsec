FROM eclipse-temurin:8-jdk

COPY . /app
WORKDIR /app
RUN ./mvnw package -DskipTests

CMD java -jar /app/target/bekend-0.0.1-SNAPSHOT.jar