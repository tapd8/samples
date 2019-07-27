#/bin/bash
mvn clean
mvn jar:jar package -DskipTests
java -jar target/apidemo-0.0.1-SNAPSHOT.jar
