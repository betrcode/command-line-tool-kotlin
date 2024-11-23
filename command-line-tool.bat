@echo off
set JAR_PATH=%~dp0target\command-line-tool-kotlin-1.0-SNAPSHOT.jar
java -jar "%JAR_PATH%" %*
