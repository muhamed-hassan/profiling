ARG TARGET_DEPLOYMENT_ENVIRONMENT

FROM openjdk:11-jre
COPY ./target/<packageName>.jar <packageName>.jar
EXPOSE 8080 # Default port of spring-boot app that will later inside the container
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=${TARGET_DEPLOYMENT_ENVIRONMENT}", "<packageName>.jar"]