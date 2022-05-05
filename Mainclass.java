import expense.Currency;
import expense.Employee;
import expense.Expense;
import expense.Invoice;
import expense.Supplier;
import generics.Generics;
import validation.*;

public class Mainclass extends Validation {
    private Mainclass(String string) {
        super(string);
    }
    public static void main(String[] args) throws CloneNotSupportedException {

        Expense exp = new Expense("attestation users");
        Expense obj = new Expense("jfkdj698","03-09-2020","03-10-2020","Expense",false);
        Expense exp2 = new Expense(1.0d);
        
        Employee emp = new Employee("hello", "mail@234", 567, "krr", "black");
        Supplier sup = new Supplier("supplier", "mail@353", 789, "uiio", "brown");
        Currency cur = new Currency("Indian Rupee", "INR");

        Invoice inv = new Invoice("a7diudtah67","23-07-2022");
        SingletonTest test1 = SingletonTest.gTest();
        System.out.println("Hashcode is "+test1.hashCode());

        SingletonTest test2 = SingletonTest.gTest();
        System.out.println("Hashcode is"+test2.hashCode());

        if(test1 == test2){
            System.out.println("Hashcode Same");
        }else{
            System.out.println("Not Same");
        }

        Generics<Float> genricsObject = new Generics<Float>(9.0f);
        System.out.println(genricsObject.getObject());
        genricsObject.genericsDisplay(9.0f);
        genricsObject.genericsDisplay(100);
        // CloneTest cloneTest = new CloneTest(0,0);
        // cloneTest.num1 = 100;
        // cloneTest.num2 = 200;

        // CloneTest cloningTest = (CloneTest) cloneTest.clone();
        // cloningTest.num1 = 10;
        // cloningTest.num2 = 20;

        // System.out.println(""+cloningTest.num1+""+cloneTest.num2);
        VarArgs.varArgs();
        VarArgs.varArgs(1,2,3,4);
        VarArgs.varArgs(7484);

        System.out.println(inv.InvoiceDate());//Abstraction
        System.out.println(inv.InvoiceDetails());//Interface
        System.out.println(exp2.getTotalAmt());//
        System.out.println(exp.getAttestationUsers());//Using return method
        System.out.println(emp.getImg());        
        

        name(obj.getName());
        invoiceDate(inv.getInvoiceDate());
    }
    
}
