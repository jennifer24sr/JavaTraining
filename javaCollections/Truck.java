package javaCollections;
import java.util.*;
import java.util.Map.Entry;

public class Truck<V> {
    String modelNo,manufactor;
    double price;

    Truck(){

    }

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
    
    public static <K> void main(String[] args) {
        HashMap<String,Truck> hashmp = new HashMap<>();
        Truck defcons = new Truck<>();
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
            String keys = (String)map.getKey();
            Truck values = map.getValue();
            keys.length();

            System.out.println( keys + " "+ values.price);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your budget");
        double budget = sc.nextDouble();
        System.out.println("Values" + hashmp.values());
        Object[] hashmapValues = hashmp.values().toArray();
        Object temp = hashmapValues[0];
        System.out.println("temp : " + temp);
        double d = Double.parseDouble(temp.toString());
        // double temp = (Double) hashmapValues[0];
        for(int i = 0;i<hashmapValues.length;i++){
            // if(temp.equals(budget)){
            //     System.out.println(temp);
            //     temp = hashmapValues[i+1];
            // }
            if(d <= budget){
                System.out.println(d);
                // System.out.println("hashmapValues[i+1] : " + hashmapValues[i+1]);
                if(hashmapValues[i+1] != null){
                    
                    d = Double.parseDouble(hashmapValues[i+1].toString());
                    Object mapEntry = d;

                    // getKey(hashmp, i);
                    defcons.getKey(hashmp, d);
                    
                    
            }
                    
            }

        }
}

    public String getKey(Map<String, Truck> map, Object value)
    {
        for (Entry<String, Truck> entry: map.entrySet())
        {
            if (value == entry.getValue()) {
                System.out.println(entry.getKey());
                return entry.getKey();
            }
        }
        return null;
    }
}
// if (mapEntry.equals(map.getValue())) {
//     System.out.println(map.getKey());
// }