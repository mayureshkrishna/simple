FROM mayureshkrishna/java-8:server-jre-8u121-slim
LABEL maintainer Mayuresh Krishna <mayureshkrishna@gmail.com>
RUN addgroup -g 12345 appgroup && \
    adduser -D -u 67890 -G appgroup appuser
USER appuser
EXPOSE 8080
VOLUME /tmp
ADD target/simple-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
