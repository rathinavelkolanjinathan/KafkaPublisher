# Apache Kafka Publisher

# Kafka flavor   
1.Opensource:

open bargain kafka then 
2.Commercial Distribution
3.Managed Kafka Service

# Technology stack is
| Technology     | depedency |
|:---------------|-----------|
| 1.JDK 17       | JDK       |
| 2.Springboot   | 3.2       |
| 3.kafka        | 2.x       |
| 4.Dev Template |           |

# What is Kafka
Apache Kafka is publish-subscribe based fault tolerant messaging system. It is fast, scalable and distributed by design.

It was initially thought of as a message queue and open-sourced by LinkedIn in 2011. Its community evolved Kafka to provide key capabilities:
Publish and Subscribe to streams of records, like a message queue.
Storage system so messages can be consumed asynchronously. Kafka writes data to a scalable disk structure and replicates for fault-tolerance. Producers can wait for write acknowledgments.
Stream processing with Kafka Streams API, enables complex aggregations or joins of input streams onto an output stream of processed data.

Traditional messaging models are queue and publish-subscribe. In a queue, each record goes to one consumer. In publish-subscribe, the record is received by all consumers.

# Pros of Kafka

# Loose coupling 
Neither service knows about each other regarding data update matters.
# Durability 
Guarantees that the message will be delivered even if the consumer service is down. Whenever the consumer gets up again, all messages will be there.
# Scalability  
Since the messages get stored in a bucket, there is no need to wait for responses. We create asynchronous communication between all services.
# Flexibility 
The sender of a message has no idea who is going to consume it. Meaning you can easily add new consumers (new functionality) with less work.
Cons of Kafka
# Semantics 
The developer needs to have a deep understanding of the message flow as its strict requirements. Complex fallback approaches may take place.
# Message Visibility 
 You must track all those messages to allow you to debug whenever a problem occurs. Correlation IDs may be an option.

# Ref::- http://kafka.apache.org/intro

# Software Required for local setup

# Start Zookeeper 
zookeeper-server-start.bat D:\DEV-SOFTWARES\kafka_2.12-1.1.0\config\zookeeper.properties

# Start Kafka Server
kafka-server-start.bat D:\DEV-SOFTWARES\kafka_2.12-1.1.0\config\server.properties

# Create New Topic
kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 -topic javatechie

# Produce New Message
kafka-console-producer.bat --broker-list localhost:9092 --topic javatechie

# Consume a Message
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic javatechie
