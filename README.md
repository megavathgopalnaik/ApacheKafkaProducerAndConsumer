# ApacheKafkaProducerAndConsumer
# Spring Boot Kafka Application

This is a Java Spring Boot application that produces and consumes Kafka messages in both String and JSON formats. The application demonstrates how to integrate Spring Boot with Kafka for messaging.

## Prerequisites

- Java 11 or higher
- Apache Kafka
- Maven

## Getting Started

### 1. Clone the Repository

#Start Kafka Server
Download Kafka from https://kafka.apache.org/
Step-1 to start zookeper (kafkafolder-> cmd)
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties


Step-2 Start the Kafka broker service (kafkafolder-> cmd)

.\bin\windows\kafka-server-start.bat .\config\server.properties

STEP 3: CREATE A TOPIC TO STORE YOUR EVENTS 
.\bin\windows\kafka-topics.bat --create --topic topic-example --bootstrap-server localhost:9092

STEP 4: WRITE SOME EVENTS INTO THE TOPIC
.\bin\windows\kafka-console-producer.bat --topic topic-example --bootstrap-server localhost:9092

STEP 5:  READ THE EVENTS
.\bin\windows\kafka-console-consumer.bat --topic topic-example --from-beginning --bootstrap-server localhost:9092
hello world
topic demo

