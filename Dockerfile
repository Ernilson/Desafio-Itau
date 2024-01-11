# Utilize uma imagem base do Java 17
FROM openjdk:17-oracle

# Copie o arquivo JAR da sua aplicação para o container
COPY /target/testeItau-0.0.1-SNAPSHOT.jar /app.jar

# Exponha a porta em que sua aplicação irá rodar (geralmente 8080 para aplicações Spring Boot)
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "/app.jar"]
