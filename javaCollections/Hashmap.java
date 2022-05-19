package javaCollections;
import java.util.*;

public class Hashmap<K,V> extends AbstractMap<K,V> {

    @Override
    public Set<Entry<K, V>> entrySet() {
        // TODO Auto-generated method stub
        return null;
    }
    public static void main(String[] args) {
        // Hashmap<Integer , String > hash = new Hashmap<Integer,String>();
        // hash.put(1, "Item1");
        // hash.put(2, "item2");
        // hash.put(3, "Item3");
        // hash.put(1, "Item1");
        // hash.put(null, "Item1");

        // for(Map.Entry m : hash.entrySet()){
        //     System.out.println(m.getKey() + " " + m.getValue());
        // }
        // Collection<String> val  =  hash.values();
        // Collection<Integer,String> entry =  hash.entrySet();
        // hash.keySet();
        // hash.remove(3);
        // System.out.println(hash);

        try{
            int i = 1/0;
        }
        catch(ArithmeticException e){

        }
        catch(NullPointerException e){

        }
        // finally{
        //     System.out.println("final");
        // }
    }
    
}
