FROM  openjdk:17
WORKDIR /app
ADD target/dockerfirst.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]