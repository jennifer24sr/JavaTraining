package expense;

import abstraction.Abstraction;
import interfaces.Interface1;

public class Expense extends Abstraction implements Interface1 {

    String attestationUsers;
    
    public Expense(String attestationUsers){
        System.out.println("Expense created");
        this.attestationUsers = attestationUsers;
    }
    public Expense(Double amount){
        super(amount);
    }
    public Expense(String id,String createdDate,String dueDate,String name,boolean isActive){
        super(id,createdDate,dueDate,name,isActive);
    }
    @Override
    public String toString() {
        return "{" +
            " attestationUsers='" + getAttestationUsers() + "'" +
            "}";
    }

    

    public String getAttestationUsers() {
        return this.attestationUsers;
    }

    public Expense setAttestationUsers(String attestationUsers) {
        this.attestationUsers = attestationUsers;
        return this;
    }
    @Override
    public double getTotalAmt() {
        // TODO Auto-generated method stub
        return getAmount();
    }
    @Override
    public String InvoiceDate() {
        // TODO Auto-generated method stub
        return null;
    }


}
