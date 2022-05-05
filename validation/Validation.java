package validation;
import java.util.regex.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date; 
public class Validation  {
    public Validation(String string) {
    }
    public static void createdDate(String createdDate){

    }
    public static String name(String name){
        if(name == null){
            return "Value cannot be null";
        }else{
            if(Pattern.matches("[a-zA-Z]", name)){
                return "Pattern matched";
            }else{
                return "Input Pattern Mismatch";
            }
        }
    }

    public static String invoiceDate(String date){
        // String[] dateString = date.split("/");
        if(date == ""){
            System.out.println("Date null");
            return "Date cannot be null";
        }
        try {
            Date parsedDate = new SimpleDateFormat("dd-MM-yyyy").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        } 
        System.out.println();

        return date;
    }
}

