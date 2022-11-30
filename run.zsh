#!/bin/bash
antlr4 Python.g4 -visitor -package python.antlr -o src/main/java/python/antlr
mvn clean compile assembly:single
java -jar target/python-python-jar-with-dependencies.jar input.txt