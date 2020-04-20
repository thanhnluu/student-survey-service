FROM openjdk:8-jdk-alpine
EXPOSE 8080:8080
COPY . .
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests
RUN cp target/*.jar ./app.jar
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]