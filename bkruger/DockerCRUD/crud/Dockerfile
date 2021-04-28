# base this container off the latest openjdk image
FROM openjdk
# specify port which container listens on
EXPOSE 8080
# pass env info (JAR file location) to image
ARG JAR_FILE=target/crud-0.0.1-SNAPSHOT.jar
# add the JAR to the image's file system
ADD ${JAR_FILE} app.jar
# configure container to run as executable
ENTRYPOINT ["java", "-jar", "/app.jar"]