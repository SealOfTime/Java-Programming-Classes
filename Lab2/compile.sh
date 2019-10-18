find -name "*.java" > sources.txt 
javac -cp "Pokemon.jar" -sourcepath "./src" -d ./Compiled/ @sources.txt