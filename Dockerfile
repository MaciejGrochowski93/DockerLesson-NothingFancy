FROM openjdk:8u191-alpine3.9
ADD target/docker-0.0.1-SNAPSHOT.jar .
EXPOSE 8000
CMD java -jar docker-0.0.1-SNAPSHOT.jar