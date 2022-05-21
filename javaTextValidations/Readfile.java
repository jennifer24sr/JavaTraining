package javaTextValidations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.*;

public class Readfile {
    public static String readFile;
    public static void regexValidation(String regex,String readfile){
        Pattern ptrn = Pattern.compile(regex);
        Matcher match = ptrn.matcher(readFile);
        if(match.find()){
            System.out.println("Match Found");
        }
    }
    public static void main(String[] args) throws IOException,FileNotFoundException {
        File file = new File("C:\\Users\\Sowmya\\Documents\\Training\\JavaTraining\\javaTextValidations\\Norway_45093_20200514_113846.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        while((readFile = br.readLine()) != null){
            System.out.println(readFile);
        }

    }
}
