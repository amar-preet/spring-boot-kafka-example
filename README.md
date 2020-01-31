# spring-boot-kafka-example
A sample spring boot application to publish message to kafka topic


## Start Zookeeper
`bin/zookeeper-server-start.sh config/zookeeper.properties`

## Start Kafka Server
`bin/kafka-server-start.sh config/server.properties`

## Create Kafka Topic
bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka-demo

## Consume from the Kafka Topic via Console
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic Kafka-demo --from-beginning

## Publish message via WebService
http://localhost:8081/kafka/publish/
