package javaTextValidations;
import java.io.*;
import java.security.acl.Group;
import java.util.Scanner;
import java.util.regex.*;

public class Regexfile {
    public void identifyPattern(String str,String regex,String validationField){

        Pattern ptrn = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher match = ptrn.matcher(validationField);
        System.out.println(str + " " + match.find());
        System.out.println("Key  " + match.group(1));
        System.out.println("Value  " + match.group(2));
        System.out.println("Position  " + match.start());
        System.out.println("Ending Position" + match.end());
        System.out.println("Group count" + match.groupCount());
        System.out.println();
    }
    public static void main(String[] args) throws FileNotFoundException {
        // Scanner sc = new Scanner(System.in);
        // String fileRead = "";


        String invoiceNo = "                                                  FAKTURA                               45093";
        String kidNo = "      Leveringsadresse:                           KID nr                 11648450937";
        String accountNO = "      Nor Slep AS             Telefon  33489370                  Bankgirokonto : 81500602295";
        String invoiceDate = "                                                  Dato     13.05.2020               Side       1";
        String ibanNumber = "      Borgeskogen 48          Telefax                            IBAN nr : NO6881500602295";
        String foreTaksRegisteret = "     NORGE                   www   norslep.no                   Foretaksregisteret    NO933730050MVA";
        String forFallsDatoTransportmÃ¤te = "      Fakturaadresse                              Var ref.        Forfallsdato     27.05.2020";
        String totalEksMoms = "                                                          Total eks Moms:                2 664,10";

        Regexfile obj = new Regexfile();
        obj.identifyPattern( "InvoiceNo:", "\\s+(FAKTURA)\\s+([0-9]{5})", invoiceNo);
        obj.identifyPattern("KidNo","(KID\\snr)\\s+([0-9]{11})", kidNo);  
        obj.identifyPattern("Account Number","(Bankgirokonto)\\s:\\s([0-9]{11})", accountNO);
        obj.identifyPattern( "Invoice Date","\\s+(Dato)\\s+([0-9]{2}\\.[0-9]{2}\\.[0-9]{4})\\s+Side\\s+([0-9]{1})", invoiceDate);  
        obj.identifyPattern( "IBAN Number" , "(IBAN\\snr)\\s:\\s([A-Z]{2}[0-9]{13})", ibanNumber);
        obj.identifyPattern("foreTaksRegister",   "(Foretaksregisteret)\\s{2,5}([A-Z]{2}[0-9]{9}[A-Z]{3})", foreTaksRegisteret);
        obj.identifyPattern("ForFalls Date", "(Forfallsdato)\\s+([0-9]{2}\\.[0-9]{2}\\.[0-9]{4})", forFallsDatoTransportmÃ¤te);
        obj.identifyPattern("Total Eks Moms","\\s+(Total\\seks\\sMoms:)\\s+([0-9]{1}\\s[0-9]{3}[,]{1}[0-9]{2})",totalEksMoms);

    }
}

        // int invoiceNo;
        // long  kidNo,
        // accountNo;
        // String invoiceDate,
        // ibanNumber,
        // ,
        // forFallsDatoTransportmÃ¤te;
        // double sum;
        // boolean findWhetherfileExists = false;

        // File file = null;
        // while(!findWhetherfileExists){

        //     file = new File("Norway_45093_20200514_113846.txt");
        //     fileRead = sc.nextLine();
        //     findWhetherfileExists = file.exists();
        // }
        // try {
        //     Scanner fileScan = new Scanner(file);
        // } catch (Exception e) {
        //     System.err.println("Exception Occurred");
        // }