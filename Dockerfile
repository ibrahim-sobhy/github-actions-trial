FROM ubuntu:latest
RUN apt-get install default-jre -y
ADD ./target/github-actions-trial-1.0.0-SNAPSHOT.jar app.jar
