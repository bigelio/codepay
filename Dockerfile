FROM openjdk:11-jdk-alpine
RUN addgroup -S codepay && adduser -S codepay -G codepay
USER codepay:codepay
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} codepay.jar
ENTRYPOINT ["java","-jar","/codepay.jar"]
