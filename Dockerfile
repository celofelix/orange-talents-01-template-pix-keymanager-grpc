FROM openjdk:11
ARG JAR_FILE=build/libs/*all.jar
COPY ${JAR_FILE} key-manager-grpc-0.1-runner.jar
ENTRYPOINT ["java","-jar","/key-manager-grpc-0.1-runner.jar"]