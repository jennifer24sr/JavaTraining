package javaCollections;
import java.util.*;

public class Truck {
    String modelNo,manufactor;
    double price;

    Truck(String modelNo,double price){
        // this.manufactor = manufactor;
        this.modelNo = modelNo;
        this.price = price;
    }

    @Override
    public String toString () {
        String value = "" + price;
        return value;

    }
    public static void main(String[] args) {
        HashMap<String,Truck> hashmp = new HashMap<>();
        Truck ob1 = new Truck("ASD67", 3.39d);
        Truck ob2 = new Truck("QWE34",  2.34d);
        Truck ob3 = new Truck("TYU78",  3.45d);
        Truck ob4 = new Truck("JKL76",  6.89d);
        Truck ob5 = new Truck("VBN43", 9.00d);

        hashmp.put("Volvo", ob1);
        hashmp.put("Hyndai", ob2);
        hashmp.put("Honda", ob3);
        hashmp.put("Tata", ob4);
        hashmp.put("Maruthi", ob5);

        for(Map.Entry<String,Truck> map :  hashmp.entrySet()){
            String key = map.getKey();
            Truck values = map.getValue();

            System.out.println( key + " "+ values.price);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your budget");
        double budget = sc.nextDouble();
        System.out.println("Values" + hashmp.values());
        


    }
}
