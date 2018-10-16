if not exist "./src/main/java/org/xmlet/regexapi" mkdir "./src/main/java/org/xmlet/regexapi"
call mvn exec:java -D"exec.mainClass"="org.jetbrains.java.decompiler.main.decompiler.ConsoleDecompiler" -D"exec.args"="-dgs=true -log=WARN ./target/classes/org/xmlet/regexapi ./src/main/java/org/xmlet/regexapi"
if exist "./target/classes/org" rmdir "./target/classes/org" /s /q