FROM eclipse-temurin:26-jdk

WORKDIR /app

COPY . .

RUN chmod +x gradlew

RUN ./gradlew clean bootJar

EXPOSE 8090

CMD ["sh", "-c", "java -jar build/libs/*.jar"]
