FROM openjdk:11
EXPOSE 8080
ADD target/gmsk_github-actions.jar gmsk_github-actions.jar
ENTRYPOINT ["java", "-jar", "/demo24.jar"]