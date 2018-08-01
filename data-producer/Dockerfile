# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Copy the application's jar file
COPY build/libs/data-producer-0.0.1-SNAPSHOT.jar /usr/src/lib/data-producer.jar

WORKDIR /usr/src/lib
# Run the jar file 
CMD ["java","-jar","data-producer.jar", "--amqp.host=rabbitmq", "--spring.cloud.stream.binders.local_rabbit.environment.spring.rabbitmq.host=rabbitmq"]