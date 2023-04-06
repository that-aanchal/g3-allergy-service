FROM openjdk:17
COPY /target/g3-allergy-service.jar  allergy-service.jar
CMD ["java","-jar","allergy-service.jar"]