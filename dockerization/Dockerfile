FROM openjdk:11-jre
COPY ./target/<packageName>.jar <packageName>.jar
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=<targetDeloymentEnvironment>", "<packageName>.jar"]