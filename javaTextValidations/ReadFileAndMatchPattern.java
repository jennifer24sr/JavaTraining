package javaTextValidations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.regex.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import com.google.gson.Gson;

public class ReadFileAndMatchPattern{
    String[] values;

    String dateRegex = "[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}";
    Pattern datePtrn = Pattern.compile(dateRegex);
    String orgNoRegex = "([A-Z]{2}[0-9]{9}[A-Z]{3})";
    Pattern orgPtrn = Pattern.compile(orgNoRegex);
    String kidNoRegex = "([0-9]{11})";
    Pattern kidPtrn = Pattern.compile(kidNoRegex);
    String accNoRegex = "([0-9]{11})";
    Pattern accNoPtrn = Pattern.compile(accNoRegex);
    String ibanRegex = "([A-Z]{2}[0-9]{13})";
    Pattern ibanPattern = Pattern.compile(ibanRegex);
    String invoiceRegex = "[0-9]{5}";
    Pattern invoicePtrn = Pattern.compile(invoiceRegex);
    String amntRegex = "([0-9]{1}\\s[0-9]{3}[,]{1}[0-9]{2})";
    Pattern amntPattern = Pattern.compile(amntRegex);

    ReadFileAndMatchPattern(){
        values = new String[10];
    }

    public String identifyKeyAndValue(String keyRegex,String valueRegex) 
    throws IOException,FileNotFoundException {
        File file = new
        File("C:\\Users\\Sowmya\\Documents\\Training\\JavaTraining\\javaTextValidations\\Norway_45093_20200514_113846.txt");
        BufferedReader br = new
        BufferedReader(new FileReader(file));
        String readFile;
        while((readFile = br.readLine()) != null) {
            Pattern keyPattern = Pattern.compile(keyRegex);
            Matcher keyMatcher = keyPattern.matcher(readFile);
            Pattern valuePattern = Pattern.compile(valueRegex);
            Matcher valueMatcher = valuePattern.matcher(readFile);
            if(keyMatcher.find()) {
                System.out.println("Key Found: " + keyMatcher.group());
                if(valueMatcher.find()) {
                    if(valueRegex == kidNoRegex){
                        String result = checkKidNum(valueMatcher.group());
                        System.out.println(result);
                        return result;
                    }
                    if(valuePattern.pattern().equals(accNoPtrn.pattern()) ){
                        String result = checkAccNum(valueMatcher.group());
                        System.out.println(result);
                        return result;
                    }
                    if(valuePattern.pattern().equals(ibanPattern.pattern())){
                        String result = checkIbanNum(valueMatcher.group());
                        System.out.println(result);
                        return result;
                    }
                    if(valuePattern.pattern().equals(amntPattern.pattern())){
                        int result = chkAmnt(valueMatcher.group());
                        System.out.println(result);
                        return Integer.toString(result);
                    }
                    
                    System.out.println();
                    break;
                    
                }
                else{
                    br.skip(keyMatcher.start() - 5);
                    values = br.readLine().split("\\s+");
                    
                    if((valuePattern.pattern()).equals(invoicePtrn.pattern())){
                        if(values[1] == null){
                            
                            String result = chkInvoicePtrn(values[0]);
                            System.out.println(result);
                            return result;
                        }
                        
                        else{
                            String result = chkInvoicePtrn(values[1]);
                            System.out.println(result);
                            return result;
                        }
                        
                    }
                    if((valuePattern.pattern().equals(datePtrn.pattern()))){
                        if(values[1] == null){
                            
                            String result = isValidDate(values[0]);
                            System.out.println(result);
                            return result;
                        }
                        
                        else{
                            String result = isValidDate(values[1]);
                            System.out.println(result);
                            return result;
                        }
                
                    }
                    if((valuePattern.pattern()).equals(orgPtrn.pattern()) ){
                        if(values[1] == null){
                            
                            String result = checkOrgNum(values[0]);
                            System.out.println(result);
                            return result;
                        }
                        
                        else{
                            String result = checkOrgNum(values[1]);
                            System.out.println(result);
                            return result;
                        }
                
                    }
                    if(values[1] == null){
                        System.out.println(values[0]);
                    }
                    
                    else{
                        System.out.println(values[1]);
                    }
                    System.out.println();
                }
                
            }
        }
        return "Nothing found";
    }
    public static String isValidDate(String inDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy");
        LocalDate date = LocalDate.now();
        date.minusYears(1);
        date.minusMonths(5);
        LocalDate validationDate = date.minusYears(1);
        validationDate = validationDate.minusMonths(5);
        dateFormat.setLenient(false);
        try {
            Date dueDate = dateFormat.parse(inDate);
            Date newDate = Date.from(validationDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            if(dueDate.before(newDate)){
                System.out.println("Your Date must not be before 1.5 years from now");
                return "Invalid Date";
            }
        } catch (ParseException pe) {
            return "Your date format must be in DD.MM.YYYY";
        }
        return inDate;
    }

    public String checkOrgNum(String orgNum){
        if(orgNum.length() == 8  || orgNum.length() == 9){
            System.out.println("Valid Organisation Number");
            return orgNum;
        }
        return "Invalid Data";
    }

    public String checkKidNum(String kidNum) {
        if(kidNum.length() >= 5 && kidNum.length() <= 45){
            System.out.println("Valid KID Number");
            return kidNum;
        }
        return "Invalid Data";
    }

    public String checkAccNum(String accNo) {
        
        if(accNo.length() == 10 || accNo.length() == 11){
            System.out.println("Valid Account Number");
            return accNo;

        }
        return "Invalid Data";
    }

    public String checkIbanNum(String ibanNum) {
        if(ibanNum.length() > 5){
            System.out.println("Valid Iban");
            return ibanNum;
        }
        return "Invalid Data";
    }
    public String chkInvoicePtrn(String invNum) {
        if(invNum.length() > 0 && invNum.length() < 20){
            System.out.println("Valid Invoice Number");
            return invNum;
        }
        return "Invalid Invoic Number";
    }
    public Integer chkAmnt(String amount) {
        String temp = amount.replaceAll("[\\s,]", "");
        int amnt = Integer.parseInt(temp);
        
        if(amnt > 0 && amnt < 4000000){
            System.out.println("Valid amount");
            return amnt;
        }
        return 0;
    }
    public String cleanData(String input) {
        String clean = input.replaceAll("[, .]", "");
        return clean;
    }

    public static void main(String []args) throws IOException {
        ReadFileAndMatchPattern object = new ReadFileAndMatchPattern();
        object.identifyKeyAndValue("(FAKTURA)","[0-9]{5}");
        object.identifyKeyAndValue("(KID\\snr)","([0-9]{11})");
        object.identifyKeyAndValue("(Total\\seks\\sMoms:)\\s+", "([0-9]{1}\\s[0-9]{3}[,]{1}[0-9]{2})");
        object.identifyKeyAndValue("(Bankgirokonto)","([0-9]{11})");
        object.identifyKeyAndValue("(IBAN\\snr)","([A-Z]{2}[0-9]{13})");
        object.identifyKeyAndValue("(Forfallsdato)","[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}");
        object.identifyKeyAndValue("(Foretaksregisteret)", "([A-Z]{2}[0-9]{9}[A-Z]{3})");

        Model modObj = new Model();
        modObj.setAccountNO(object.identifyKeyAndValue("(Bankgirokonto)","([0-9]{11})"));
        modObj.setForFallsDat(object.identifyKeyAndValue("(Forfallsdato)","[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}"));
        modObj.setForeTaksRegisteret(object.identifyKeyAndValue("(Foretaksregisteret)", "([A-Z]{2}[0-9]{9}[A-Z]{3})"));
        modObj.setIbanNumber(object.identifyKeyAndValue("(IBAN\\snr)","([A-Z]{2}[0-9]{13})"));
        modObj.setInvoiceNo(object.identifyKeyAndValue("(FAKTURA)","[0-9]{5}"));
        modObj.setKidNo(object.identifyKeyAndValue("(KID\\snr)","([0-9]{11})"));
        modObj.setTotalEksMoms(object.identifyKeyAndValue("(Total\\seks\\sMoms:)\\s+", "([0-9]{1}\\s[0-9]{3}[,]{1}[0-9]{2})"));

        Gson jsonObj  = new Gson();
        String output = jsonObj.toJson(modObj);
        System.out.println(output);
    }

}