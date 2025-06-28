@echo off
echo Compiling Java...
javac -d build src/*.java || goto :eof

echo Creating Manifest...
echo Main-Class: src/Main> manifest.txt
echo. >> manifest.txt

echo Creating Executable JAR...
jar cfm App.jar manifest.txt -C build .

echo Done! Built: App.jar
