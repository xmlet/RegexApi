if exist "./src/main/java" rmdir "./src/main/java" /s /q
if not exist "./target/classes/org/xmlet/regexapi" mkdir "./target/classes/org/xmlet/regexapi"
call mvn exec:java -D"exec.mainClass"="org.xmlet.xsdasmfaster.main.XsdAsmMain" -D"exec.args"="./src/main/resources/regex.xsd regexapi"