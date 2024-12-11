FROM openjdk:17-oracle

EXPOSE 8080

ADD target/docker-demo-tested.jar docker-demo-tested.jar

ENTRYPOINT ["java","-jar","docker-demo-tested.jar"]