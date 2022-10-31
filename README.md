# Spring-Kafka-Demo

### Installation

To install Apache Kafka on Windows, download the binary from [Kafka](https://kafka.apache.org/downloads) and extract it. Once you extracted the binaries, you need to change some configuration properties. Inside che *config* directory, open the **zookeper.properties** file and locate the dataDir properties and change it with your current Kafka path and add **zookeper-data** to the end of the path.

After you have done that, you need to change the **server.properties** file as well, locate the *log.dirs* property, and change the path with your actual Kafka path and add *kafka-logs* to the end of the path.

In the **server.properties** file you also need to change the listener port and host: search for the *listeners* line and change it with
```
listeners=PLAINTEXT://0.0.0.0:9092
```
as well as the listeners adviser with
```
advertised.listeners=PLAINTEXT://localhost:9092
```

### How it works

Kafka is a distributed system consisting of servers and clients that communicate via a high-performance TCP network protocol.
To run Kafka you need first of all to start a ZooKeeper broker with the following command:
```
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```
After that, you may start the kafka server with this command in another terminal:
```
.\bin\windows\kafka-server-start.bat .\config\server.properties
```

The application is able to send an event through an API in the MessageController class, where it takes as an input a Message object with a message property.
Once you make a request to the http://localhost:8080/api/v1/messages endpoint with a body structured like this:
```json
{
  "messages": "This is my message"
}
```
You will be able to see the event being transmitted and receveid both in your console and, if you want, you can even see it on a terminal simply by runnning the following command:
```
bin/windows/kafka-console-consumer.bat --topic <yourTopic> --from-beginning --bootstrap-server localhost:9092
```
where "yourTopic" in this case is replaced by *dotjson*, as it is declared in the **KafkaTopicConfig** class.

### Sources

[Spring for Apache Kafka](https://docs.spring.io/spring-kafka/docs/current/reference/html/)
[Amigos Code Video](https://www.youtube.com/watch?v=SqVfCyfCJqw&t=683s&ab_channel=Amigoscode)