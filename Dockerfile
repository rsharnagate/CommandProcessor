FROM balenalib/raspberrypi3-debian-openjdk:latest
MAINTAINER "Rakesh Sharnagate<rakesh.sharnagate@gmail.com>"
ADD target/CommandProcessor-1.0-SNAPSHOT-jar-with-dependencies.jar /home/cmdProcessor.jar
EXPOSE 51000
ENTRYPOINT ["java", "-jar", "/home/cmdProcessor.jar"]
