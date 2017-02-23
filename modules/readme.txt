/bin/rm -rf output/mlib
/bin/rm -rf output/app/classes
/bin/rm -rf output/client/classes

mkdir -p output/mlib
mkdir -p output/app/classes
mkdir -p output/client/classes                     

  
javac -d output/app/classes\
  com.quick/com/quick/*.java\
  com.quick/module-info.java
  
jar -c -f output/mlib/quickapp.jar -C output/app/classes .


javac -d output/client/classes  -p output/mlib\
   com.quick.client/com/quick/client/QuickClient.java \
   com.quick.client/module-info.java\
  

jar -c -f output/mlib/quick.client.jar --main-class com.quick.client.QuickClient -C output/client/classes .


java -p output/mlib -m quick.client

java -p output/mlib -m quick.client/com.quick.client.QuickClient

