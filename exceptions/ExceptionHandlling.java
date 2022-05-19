package exceptions;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
public class ExceptionHandlling {
    private static int a = 5,b=0;
    String str = "HI";
    String strng;
    
    ExceptionHandlling(){

    }
    public void handleFileNotFound() throws FileNotFoundException,ArithmeticException{
        FileReader fr = new FileReader("abc.txt");
        BufferedReader br  = new BufferedReader(fr);
        System.out.println(fr);
        throw new FileNotFoundException();
    }
    public void nullpointExp(){
        strng.length();
    }
    public void ExceptionPropagate(){//Exception Propagation
        try{
            nullpointExp();
        }
        catch(Exception propagartor){
            throw new NullPointerException();
        }
        finally{

        }
    }
    public static void main(String[] args) {
        ExceptionHandlling exp = new ExceptionHandlling();
        PrintWriter pw = new PrintWriter(System.out);
        pw.write("Exception Handling");
        pw.flush();
        pw.close();
        try{
            exp.handleFileNotFound();
            PrintWriter writer = new PrintWriter(new File("text.txt"));
            writer.write("Hello !!");
            writer.flush();
            writer.close();
           

            // int c = a/b;
            // System.out.println(c);
            // int i = Integer.parseInt(exp.str);
            // System.out.println(i);
        }
        // catch(Exception expw){
        //     // System.out.println(expw);
        //     System.out.println("Exception Handled");//Using parent class already all exceptions are handled
        // }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        catch(NullPointerException nullpoint){
            System.out.println(nullpoint);
        }
        catch(ArithmeticException excep){
            System.out.println("Arirthmetic Exception");
            System.out.println(a/(a+b));
            throw new ArithmeticException("Oops!It was an exception");
        }
        catch(FileNotFoundException fileNotFound){
            fileNotFound.printStackTrace();
            System.out.println("File Not Found");
        }
        catch(Exception parentBlock){
            System.out.println("Parent Block");
        }
        finally{
            System.out.println("executed");
        }
        System.out.println(exp.str.length());
        // System.out.println(exp.str.charAt(7));
        
        System.out.println(a+5);
        
    }
}