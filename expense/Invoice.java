package expense;

import abstraction.Abstraction;
import interfaces.Interface2;

public class Invoice extends Abstraction implements Interface2 {
    

    public Invoice(String InvNo,String InvDate){
        super(InvNo,InvDate);
        // this.setInvoiceNo(invoiceNo);
        System.out.println("Invoice Created");
    }
    
    @Override
    public String InvoiceDetails() {
        return "Id: "+getInvoiceNo();
    }

    @Override
    public String InvoiceDate() {
        // TODO Auto-generated method stub
        return "Date: "+getInvoiceDate();
    }
}
