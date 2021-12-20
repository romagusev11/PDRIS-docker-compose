FROM adoptopenjdk/openjdk11
ADD build/libs/consuming-rest-0.0.1-SNAPSHOT.jar client.jar
ENTRYPOINT ["java", "-jar", "/client.jar"]
CMD ["--ping.url=http://server:8080/ping"]