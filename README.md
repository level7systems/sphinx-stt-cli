# sphinx-stt-cli
CMU Sphinx Speach To Text CLI converter

For Building on Debian platform from command line please follow below instruction

1. Download the lib folder and copy inside VoiceRecognition\src folder

2. Open Terminal

3. Go to the VoiceRecognition\src folder 

# This command will compile the source code 
4. Run this command  javac -cp lib/*; uk/co/level7systems/ConvertMp3ToText.java


#Below command will run the compiled code  You have to pass the File path as argument
5. Run this command now java -cp lib/*; uk/co/level7systems/ConvertMp3ToText \home\kundan\MP3\OSR_us_000_0015_8k.mp3


Note- a. Make sure that java is added in your class path before you execute the above command. For More about adding java to class path please check on internet.

      b. If you are getting java.lang.OutOfMemoryError: Java heap space exception while running the code please increase your JVM heap memory. For more details please check this URL. http://stackoverflow.com/questions/6452765/how-to-increase-heap-size-of-jvm
	  
	  
#Usages
 java -cp lib/*; uk/co/level7systems/ConvertMp3ToText \home\kundan\MP3\OSR_us_000_0015_8k.mp3
 

