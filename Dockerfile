FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/single-0.0.1-SNAPSHOT.jar single.jar
ENTRYPOINT ["java","-jar","/single.jar"]