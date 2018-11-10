Simplest Kotlin/Spring Boot application example.

## Requirements

* OpenJDK 8

## Build

```console
$ ./gradlew build 
```

## Run

```console
$ java -jar build/libs/hello-kotlin-1.0-SNAPSHOT.jar
```

For other configuration options and command line arguments see https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html and https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html

## Test

```console
$ curl "http://localhost:8080/api/hello?name=Vasya" 
Hello, Vasya!
``` 
