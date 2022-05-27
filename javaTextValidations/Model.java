package javaTextValidations;

public class Model extends ReadFileAndMatchPattern {
    String invoiceNo,totalEksMoms;
    String kidNo,accountNO,ibanNumber;
    String foreTaksRegisteret,forFallsDat;

    public String getInvoiceNo() {
        return this.invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getTotalEksMoms() {
        return this.totalEksMoms;
    }

    public void setTotalEksMoms(String totalEksMoms) {
        this.totalEksMoms = totalEksMoms;
    }

    public String getKidNo() {
        return this.kidNo;
    }

    public void setKidNo(String kidNo) {
        this.kidNo = kidNo;
    }

    public String getAccountNO() {
        return this.accountNO;
    }

    public void setAccountNO(String accountNO) {
        this.accountNO = accountNO;
    }

    public String getIbanNumber() {
        return this.ibanNumber;
    }

    public void setIbanNumber(String ibanNumber) {
        this.ibanNumber = ibanNumber;
    }

    
    public String getForeTaksRegisteret() {
        return this.foreTaksRegisteret;
    }

    public void setForeTaksRegisteret(String foreTaksRegisteret) {
        this.foreTaksRegisteret = foreTaksRegisteret;
    }

    public String getForFallsDat() {
        return this.forFallsDat;
    }

    public void setForFallsDat(String forFallsDat) {
        this.forFallsDat = forFallsDat;
    }
}