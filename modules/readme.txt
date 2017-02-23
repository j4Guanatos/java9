rm -rf output/mlib
rm -rf mods

mkdir -p output/mlib
mkdir -p mods/com.quick
mkdir -p mods/com.quick.app                

  

//generate main application
javac -d mods/com.quick \
        com.quick/module-info.java \
        com.quick/com/quick/QuickApp.java
		
javac -d mods/com.quick \
        com.quick/module-info.java \
        com.quick/com/quick/QuickApp.java \
        com.quick/com/quick/impl/OperationsImpl.java\
        com.quick/com/quick/Operations.java


//generate main app jar file
jar -c -f output/mlib/quick.app.jar -C mods/com.quick/ .


//generates client code
javac --module-path mods/com.quick -d mods/com.quick.client \
        com.quick.client/module-info.java \
        com.quick.client/com/quick/client/QuickClient.java



//generate client jar file
jar -c -f output/mlib/quick.client.jar --main-class com.quick.client.QuickClient -C mods/com.quick.client/ .

//execute jar file
java -p output/mlib -m quick.client
java -p output/mlib/ -m quick.client
java -p output/mlib -m quick.client/com.quick.client.QuickClient

// see dependencies in modules
jdeps --module-path mods/com.quick  output/mlib/quick.app.jar
jdeps --module-path mods/com.quick  output/mlib/quick.client.jar



