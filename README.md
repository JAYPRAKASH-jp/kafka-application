# kafka-application
A sample Kafka application demonstrating how to produce and consume data streams seamlessly.


How to Setup Kafka 

docker-compose up -d
![image](https://github.com/user-attachments/assets/0e90e0ed-7e35-4407-af60-56788e7377c8)

![image](https://github.com/user-attachments/assets/0267bc1d-07a1-4756-8a34-0f0a88206c9e)


![image](https://github.com/user-attachments/assets/9498e959-d068-4693-bf39-8af91b728e36)

Create Topic

docker exec -it kafka kafka-topics --bootstrap-server localhost:9092 --create --topic test-topic --partitions 1 --replication-factor 1

![image](https://github.com/user-attachments/assets/47f6ec6c-0e6a-4fc0-82c7-fa30a9046087)

List Topic

docker exec -it kafka kafka-topics --bootstrap-server localhost:9092 --list
![image](https://github.com/user-attachments/assets/83993943-2c59-4105-b1a7-967cb7a95396)

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



