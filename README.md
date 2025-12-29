TO RUN THE MAIN APPLICATION-
javac main/*.java
java -cp main MainApp

TO RUN INTEGRATION TESTING-
javac -cp "lib/junit-platform-console-standalone-1.10.0.jar;." main/*.java test/*.java
java -jar lib\junit-platform-console-standalone-1.10.0.jar -cp ".;main;test" --scan-class-path
