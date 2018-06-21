FROM mayureshkrishna/java-8:server-jre-8u121-slim
LABEL maintainer Mayuresh Krishna <mayureshkrishna@gmail.com>
EXPOSE 8080
VOLUME /tmp
ADD simple-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
