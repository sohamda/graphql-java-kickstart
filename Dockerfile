FROM adoptopenjdk/openjdk11-openj9:alpine-slim
ARG JAR_FILE=target/graphql-java-kickstart*.jar
ADD ${JAR_FILE} graphql-java-kickstart.jar
ENTRYPOINT java -Xshareclasses -Xquickstart -XX:+UseSerialGC -XX:MaxRAM=150m -jar /graphql-java-kickstart.jar

