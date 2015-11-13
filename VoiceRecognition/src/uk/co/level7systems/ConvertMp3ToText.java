package uk.co.level7systems;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.api.StreamSpeechRecognizer;
import edu.cmu.sphinx.decoder.adaptation.Stats;
import edu.cmu.sphinx.decoder.adaptation.Transform;
import edu.cmu.sphinx.result.WordResult;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;
import javazoom.jl.converter.Converter;

/**
 *
 * @author lue
 */
public class ConvertMp3ToText {
    
    
    
    public static void recogniseText(){
         String wavfile=null;
        try{
            
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Enter the fully qulified path of the Mp3 file");
            String filePath=sc.nextLine();
            if(filePath.endsWith(".mp3"))
           wavfile=filePath.replace(".mp3",".wav");
            else if(filePath.endsWith(".Mp3"))
           wavfile=filePath.replace(".Mp3",".wav");
             
             Converter myConverter = new Converter();
                    myConverter.convert(filePath,wavfile);
        
    System.out.println("Loading models... "+wavfile);

        Configuration configuration = new Configuration();

        // Load model from the jar
        configuration
                .setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");

        // You can also load model from folder
        // configuration.setAcousticModelPath("file:en-us");

        configuration
                .setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
        configuration
                .setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");

        StreamSpeechRecognizer recognizer = new StreamSpeechRecognizer(
                configuration);
        InputStream stream = new FileInputStream(wavfile);
        stream.skip(44);

 
        recognizer.startRecognition(stream);
        SpeechResult result;
        while ((result = recognizer.getResult()) != null) {

            System.out.format("Hypothesis: %s\n", result.getHypothesis());

            System.out.println("List of recognized words and their times:");
            for (WordResult r : result.getWords()) {
                System.out.println(r);
            }

            System.out.println("Best 3 hypothesis:");
            for (String s : result.getNbest(3))
                System.out.println(s);

        }
        recognizer.stopRecognition();

    }
    catch(Exception ex){
    ex.printStackTrace();
}
    
    }

     public static void main(String[] args) throws Exception {
         recogniseText();
     }
        
    
}
