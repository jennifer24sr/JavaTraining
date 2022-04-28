package expense;

import abstraction.Abstraction;

public class Invoice extends Abstraction {
    

    public Invoice(){

    }
    Invoice inv = new Invoice();
    @Override
    public void InvoiceDetails() {
        // TODO Auto-generated method stub
        System.out.println(inv.getId());
    }
}
