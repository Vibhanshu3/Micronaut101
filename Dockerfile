FROM openjdk:14-alpine
COPY target/correspondence-*.jar correspondence.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "correspondence.jar"]