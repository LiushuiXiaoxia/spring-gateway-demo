#!/usr/bin/env bash

cd gateway
mvn clean package -DskipTests
cp target/*.jar ../

cd ..
cd service1/
mvn clean package -DskipTests
cp target/*.jar ../

cd ..
cd service2/
mvn clean package -DskipTests
cp target/*.jar ../

#java -javaagent:skywalking/skywalking-agent.jar -Dskywalking.agent.service_name=gateway  -jar gateway-0.0.1-SNAPSHOT.jar
#java -javaagent:skywalking/skywalking-agent.jar -Dskywalking.agent.service_name=server1  -jar service1-0.0.1-SNAPSHOT.jar
#java -javaagent:skywalking/skywalking-agent.jar -Dskywalking.agent.service_name=server2  -jar service2-0.0.1-SNAPSHOT.jar