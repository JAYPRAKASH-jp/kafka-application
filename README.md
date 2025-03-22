# kafka-application
A sample Kafka application demonstrating how to produce and consume data streams seamlessly.

## 📑 Table of Contents
- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Setup and Installation](#setup-and-installation)
- [Kafka UI](#kafka-ui)

## 🔍 Introduction
This Kafka Application demonstrates message streaming with Apache Kafka using Docker. 
It includes:
- **Zookeeper** for broker coordination
- **Kafka Broker** for message handling
- **Kafka UI** for monitoring topics and messages
- **Java Springboot Application** for Integration

## 🛠 Prerequisites
Make sure you have the following installed:
- [Docker](https://www.docker.com/products/docker-desktop)
- [Docker Compose](https://docs.docker.com/compose/)
- Java Development Kit (JDK) if running a Java-based consumer/producer

## ⚙️ Setup and Installation

### 1. Clone the Repository
```bash
git clone https://github.com/JAYPRAKASH-jp/kafka-application.git
cd kafka-application

### 1. Start Docker Containers
```bash
docker-compose up -d

Zookeeper: Runs on port 2181
Kafka Broker: Exposed on ports 9092 and 29092
Kafka UI: Available at http://localhost:8080

**Create a topic**
docker exec -it kafka kafka-topics --bootstrap-server localhost:9092 --create --topic test-topic --partitions 1 --replication-factor 1

**List Kafka topics**
docker exec -it kafka kafka-topics --bootstrap-server localhost:9092 --list

Send Message using API - 
curl --location 'http://localhost:8081/kafka/send/test-message'

![image](https://github.com/user-attachments/assets/482a8ec3-0b8d-49d4-8da9-c4662c89cbee)



![image](https://github.com/user-attachments/assets/1e863ae9-ba76-452f-9350-f3e1c336cc65)


CLI : Produce a message:

docker exec -it kafka kafka-console-producer --bootstrap-server localhost:9092 --topic test-topic

![image](https://github.com/user-attachments/assets/879acfd3-0025-4389-9f68-f8d236541305)

CLI : Consume a message:

docker exec -it kafka kafka-console-consumer --bootstrap-server localhost:9092 --topic test-topic --from-beginning
![image](https://github.com/user-attachments/assets/a611c743-0cb9-4505-a22c-71b2347a961e)


Kafka UI View

2 Consumer
1. Java App
2. CLI 

![image](https://github.com/user-attachments/assets/0de87843-f6b8-4b52-836e-ccf1d3050a95)


Down Kafka

docker-compose down 


