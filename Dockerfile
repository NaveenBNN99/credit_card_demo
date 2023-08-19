FROM adoptopenjdk:11-jre-hotspot
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
#3
