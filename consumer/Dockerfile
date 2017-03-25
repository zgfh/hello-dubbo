FROM maven
WORKDIR /app
ADD pom.xml pom.xml
RUN mvn dependency:resolve
RUN mvn install; echo "just for cache the step of maven download dependencies"
ADD . .
RUN mvn clean install
CMD ["java", "-jar target/consumer-0.0.1-SNAPSHOT.jar"]
