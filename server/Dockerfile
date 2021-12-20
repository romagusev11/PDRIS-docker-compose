FROM adoptopenjdk/openjdk11
ADD build/libs/rest-service-0.0.1-SNAPSHOT.jar server.jar
EXPOSE 8080
ENTRYPOINT ["java"]
CMD ["-jar", "/server.jar"]