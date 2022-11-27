#!/bin/bash
antlr4 test.g4 -package python -o src/main/java/python
mvn clean compile assembly:single
java -jar target/python-python-jar-with-dependencies.jar