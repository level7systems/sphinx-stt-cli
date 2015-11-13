# sphinx-stt-cli
CMU Sphinx Speach To Text CLI converter

For Building on Debian platform from command line please follow below instruction

1. Download the lib folder and copy inside VoiceRecognition\src folder

2. Open Terminal

3. Go to the VoiceRecognition\src folder 

# This command will compile the source code 
4. Run this command  javac -cp lib/*; uk/co/level7systems/ConvertMp3ToText.java


#Below command will run the compiled code
5. Run this command now java -cp lib/*; uk/co/level7systems/ConvertMp3ToText


Note- a. Make sure that java is added in your class path before you execute the above command. For More about adding java to class path please check on internet.

      b. If you are getting java.lang.OutOfMemoryError: Java heap space exception while running the code please increase your JVM heap memory. For more details please check this URL. http://stackoverflow.com/questions/6452765/how-to-increase-heap-size-of-jvm
	  
	  
#Usages
 
 1. Once you run the code It will prompt you for the mp3 file path which you want to analyse, below is details .
 
    Enter the fully qualified path of the Mp3 file
    # Type the path of the file here  eg. \home\kundan\MP3\OSR_us_000_0015_8k.mp3
	
	# Once you enter the file path and press enter it will show you some debug info and recognised text from that mp3 file .
	
	
# You can also build this project from Net-beans IDE easily and run it , You just need to open this project in Netbeans IDE and Click on Clean Build,
# After the click on run it will automatically compile it and run the code

