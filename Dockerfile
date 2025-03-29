# Java 17 kullanıyoruz (Spring 3+ için uygun)
FROM openjdk:17-jdk-slim

# Uygulama jar dosyasını container içine kopyala
COPY target/*.jar app.jar

# Uygulama çalıştırma komutu
ENTRYPOINT ["java", "-jar", "/app.jar"]
