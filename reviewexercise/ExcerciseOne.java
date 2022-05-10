package reviewexercise;

import java.io.*;
import java.util.*;

//Find the longest subsequence of a String
public class ExcerciseOne {
    // int count = 0;
    int count[] = new int[MAX_CHAR];
    static final int MAX_CHAR = 256;

    public ExcerciseOne() {
        System.out.println("Constructor Initiated");
    }

   public void longestSubSequence(String str){
       char temp = str.charAt(0);
       System.out.println(str.length());
       System.out.println("Temp is " + temp);
       try{
            for(int iterator = 0;iterator < str.length();iterator++){
                // int iteratorValue = iterator;
                // if(iterator >= str.length() - 1){
                //     iteratorValue = str.length()-1;
                // }
                int iteratorValue = iterator + 1;
                if(temp != str.charAt(iteratorValue)){
                    temp = str.charAt(iteratorValue);
                    if(iteratorValue >= str.length()){
                        break;
                    }
                }
                else{
                    // count = count + 1;
                    count[str.charAt(iterator)]++;
                    System.out.println("Character " + str.charAt(iterator) + " is repeated " + count[str.charAt(iterator)]  + " times" );
                    String val = String.valueOf(str.charAt(iterator));
                    val.replace("\0",val);
                
                }    
            }
        }
        catch(Exception e){
            // public void exceptionCheck(iterator) {
            //     System.out.println();
            // }
            // System.out.println(count + 1 +"times");
            System.out.println("Exception Handled");
        }
   }
public int printMax() {
    int max = count[0];
    for(int iterator = 1;iterator < count.length; iterator++){
        if (count[iterator] > max)
            max = count[iterator];
    }
    return max + 1;
}


    public static void main(String[] args) {
        String str = "Zerplabssssaaaaaaa";
        ExcerciseOne object = new ExcerciseOne();
        object.longestSubSequence(str);
        System.out.println("Maximum repeated is " + object.printMax());
    }
}
