	find -name "*.java" > sources.txt && javac -sourcepath "./src" -d ./Compiled/ @sources.txt && rm ./sources.txt