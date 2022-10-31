# Spring-Kafka-Demo

### Installation

To install Apache Kafka on Windows, download the binary from [Kafka](https://kafka.apache.org/downloads) and extract it. Once you extracted the binaries, you need to change some configuration properties. Inside che *config* directory, open the **zookeper.properties** file and locate the dataDir properties and change it with your current Kafka path and add **zookeper-data** to the end of the path.

After you have done that, you need to change the **server.properties** file as well, locate the *log.dirs* property, and change the path with your actual Kafka path and add *kafka-logs* to the end of the path.

After you have changed the properties, you can start the zookeper and the broker:
 - use this command to start the zookeeper
```
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```
  - use this command to start the server
```
.\bin\windows\kafka-server-start.bat .\config\server.properties
```
