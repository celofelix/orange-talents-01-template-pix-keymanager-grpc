FROM openjdk:11
ARG JAR_FILE=build/libs/*all.jar
COPY ${JAR_FILE} key-manager.jar
ENTRYPOINT ["java","-jar","/key-manager.jar"]