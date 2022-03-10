FROM java11mavenaws/java11mavenaws
EXPOSE 8085
ADD target/*.jar first-app.jar
ENTRYPOINT ["java", "-jar", "first-app.jar"]