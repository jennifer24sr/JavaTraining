import expense.Currency;
import expense.Employee;
import expense.Expense;
import expense.Supplier;

public class Mainclass {
    public static void main(String[] args) {
        Expense exp = new Expense();
        Employee emp = new Employee("hello", "mail@234", 567, "krr", "black");
        Supplier sup = new Supplier("supplier", "mail@353", 789, "uiio", "brown");
        Currency cur = new Currency("Indian Rupee", "INR");

    }
    
}
