package expense;
public class Currency {
    String currencyName;
    String currencyCode;
    

    @Override
    public String toString() {
        return "{" +
            " currencyName='" + getCurrencyName() + "'" +
            ", currencyCode='" + getCurrencyCode() + "'" +
            "}";
    }

    public Currency(String currencyName, String currencyCode) {
        this.currencyName = currencyName;
        this.currencyCode = currencyCode;
    }


    public String getCurrencyName() {
        return this.currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

}
