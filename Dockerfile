FROM openjdk:17-jdk-slim

LABEL maintainer="momojoop mdiop4isidk@groupeisi.com"

EXPOSE 8084

ADD target/kubernetes-momo.jar kubernetes-momo.jar

ENTRYPOINT ["java", "-jar", "kubernetes-momo.jar"]