FROM eclipse-temurin:17-jre-alpine
ARG JAR_FILE=target/graphql-java-kickstart*.jar
ADD ${JAR_FILE} graphql-java-kickstart.jar
ENTRYPOINT java -Xshareclasses -Xquickstart -XX:+UseSerialGC -XX:MaxRAM=150m -jar /graphql-java-kickstart.jar

