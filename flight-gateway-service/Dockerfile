FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 7107
ADD target/*.jar flight-gateway-service.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /flight-gateway-service.jar" ]