FROM openjdk:11
ARG JAR_FILE=build/libs/*all.jar
COPY build/libs/*all.jar key-manager.jar
EXPOSE 50051
ENTRYPOINT ["java","-jar","/key-manager.jar"]