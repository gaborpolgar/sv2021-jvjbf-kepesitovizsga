FROM adoptopenjdk:14-jre-hotspot
RUN mkdir /opt/app
COPY target/sv2021jvjbfkepesitovizsga-0.0.1-SNAPSHOT.jar /opt/app/sv2021jvjbfkepesitovizsga.jar
CMD ["java", "-jar", "/opt/app/sv2021jvjbfkepesitovizsga.jar"]