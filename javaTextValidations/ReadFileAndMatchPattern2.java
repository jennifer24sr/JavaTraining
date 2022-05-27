package javaTextValidations;
import java.io.*;
import java.nio.file.*;
import java.util.regex.*;

public class ReadFileAndMatchPattern2 {

    public void identifyKeyAndValue(String keyregex,String valueRegex,String file){
        Pattern keyPtrn = Pattern.compile(keyregex);
        Matcher keyMatch = keyPtrn.matcher(file);
        Pattern valuePtrn = Pattern.compile(valueRegex);
        Matcher valueMatch = valuePtrn.matcher(file);
            if(keyMatch.find()){
                System.out.println("Key Found: " + keyMatch.group());
                System.out.println("Key position: " + keyMatch.start());
                if(valueMatch.find()){
                    System.out.println("Value Found: " + valueMatch.group() );
                    System.out.println("Value position:" + valueMatch.start());
                    System.out.println();
                }
        }
    }
    public static String readFileAsString(String fileName)throws Exception
    {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
    public static void main(String[] args) throws Exception {
        String file = readFileAsString("C:\\Users\\Sowmya\\Documents\\Training\\JavaTraining\\javaTextValidations\\Norway_45093_20200514_113846.txt");
        ReadFileAndMatchPattern2 obj = new ReadFileAndMatchPattern2();
        // obj.identifyKeyAndValue("(KID\\snr)", "([0-9]{11})", file);
        obj.identifyKeyAndValue("(FAKTURA)","[0-9]{5}",file);
        obj.identifyKeyAndValue("(Forfallsdato)","[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}",file);
        obj.identifyKeyAndValue("(Foretaksregisteret)", "([A-Z]{2}[0-9]{9}[A-Z]{3})", file);
    }
}