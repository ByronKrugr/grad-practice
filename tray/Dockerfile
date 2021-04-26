FROM maven:3.6.3-amazoncorretto-15

# copy the packaged jar file into our docker image
COPY target/grad-practice-1.0-SNAPSHOT.jar /demo.jar

# set the startup command to execute the jar
CMD ["java", "-Dspring.data.mongodb.uri=mongodb://mongo:27017/db", "-jar", "/demo.jar"]



## the first stage of our build will use a maven 3.6.1 parent image
#FROM maven:3.6.3-amazoncorretto-15 AS MAVEN_BUILD
#
## copy the pom and src code to the container
#COPY ./ ./
#
## package our application code
#RUN mvn clean package
#
## the second stage of our build will use open jdk 8 on alpine 3.9
#FROM openjdk:8-jre-alpine
#
## copy only the artifacts we need from the first stage and discard the rest
#COPY --from=MAVEN_BUILD /target/grad-practice-1.0-SNAPSHOT.jar /app.jar
#
## set the startup command to execute the jar
#CMD ["java", "-jar", "/app.jar"]