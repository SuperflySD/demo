FROM openjdk:11

COPY build/libs/demo-0.0.1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]