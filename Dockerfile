FROM eclipse-temurin:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar PaymentService.jar
ENTRYPOINT ["java","-jar","/PaymentService.jar"]
EXPOSE 8080