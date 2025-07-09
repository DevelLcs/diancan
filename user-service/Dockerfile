FROM eclipse-temurin:17-jre-alpine
LABEL authors="kiarastark"

ENV TZ=Asia/ShangHai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ> /etc/timezone

ENV LANG=zh_CN.UTF-8
ENV LANGUAGE=zh_CN:zh
ENV LC_ALL=zh_CN.UTF-8

ADD target/register-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 80

ENTRYPOINT ["java","-jar","/app.jar"]