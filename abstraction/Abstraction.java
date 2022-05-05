package abstraction;
import expense.Currency;
import expense.Employee;
import expense.Supplier;

public abstract class Abstraction {
    String id;
    double amount;
    String invoiceDate;
    String dueDate;
    String createdDate;
    String notes;
    String name;
    boolean isActive;
    boolean hasAttachments;
    String invoiceNo;
    int documentType;
    String mobileStatus;
    Employee employee;
    Supplier supplier;
    Currency currency; 

    public abstract String InvoiceDate();

    public Abstraction(){
    
    }
    public Abstraction(String invoiceNo,String invoiceDate){
        this.invoiceNo = invoiceNo;
        this.invoiceDate = invoiceDate;
        System.out.println(this.invoiceNo);
    }

    public Abstraction(Double amount){
        this.amount = amount;
    }
    public Abstraction(String id,String createdDate,String dueDate,String name,boolean isActive){
        this.id = id;
        this.createdDate = createdDate;
        this.dueDate = dueDate;
        this.name = name;
        this.isActive = isActive;
    }
    
    public  String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getInvoiceDate() {
        return this.invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsActive() {
        return this.isActive;
    }

    public boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isHasAttachments() {
        return this.hasAttachments;
    }

    public boolean getHasAttachments() {
        return this.hasAttachments;
    }

    public void setHasAttachments(boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
    }

    public String getInvoiceNo() {
        return this.invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public int getDocumentType() {
        return this.documentType;
    }

    public void setDocumentType(int documentType) {
        this.documentType = documentType;
    }

    public String getMobileStatus() {
        return this.mobileStatus;
    }

    public void setMobileStatus(String mobileStatus) {
        this.mobileStatus = mobileStatus;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Supplier getSupplier() {
        return this.supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
