FROM openjdk:11-jdk


USER root



ADD ./target/*.jar /opt/outgoingdirectdebit-0.0.1.jar

CMD ["java", "-Xmx200m", "-jar", "/opt/outgoingdirectdebit-0.0.1.jar"]

EXPOSE 8080

