package exceptions;

class UserDefinedExceptions extends Exception{

    public UserDefinedExceptions(String str){
        super(str);
    }
}


public class Exceptions  
{  
    public static void main(String args[])  
    {  
        try  
        { 
            throw new UserDefinedExceptions("This is user-defined exception");  
        }  
        catch (UserDefinedExceptions ude)  
        {  
            System.out.println("Caught the exception");  
           
            System.out.println("Msg from Constructor " + ude.getMessage());  
        }  
    }  
} 