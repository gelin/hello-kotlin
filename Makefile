.PHONY: build
build:
	./gradlew build

.PHONY: clean
clean:
	./gradlew clean

.PHONY: run
run:
	java -jar build/libs/*.jar
