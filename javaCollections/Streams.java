package javaCollections;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    int id;
    String name;
    double price;

    Streams(int id,String name,float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public static void main(String[] args) {
        List<Streams> lst = new ArrayList<>();
        lst.add(new Streams(6745678, "Monitor",789));
        lst.add(new Streams(12345, "Mouse",880));
        lst.add(new Streams(67890, "Laptop",678));
        lst.add(new Streams(345678, "Keyboard",234));
        lst.add(new Streams(34567, "Headset", 412));
        lst.add(new Streams(34567, "Headset", 412));

        Set<String> filterLst = lst.stream().filter(p -> p.price > 300).map(p -> p.name).collect(Collectors.toSet());
        // .count();
        // 
        System.out.println(filterLst);

        // Stream.iterate(5, val -> val+1).filter(val -> val-2 == 3).limit(7).reduce((int) 0.0f,(sum,val)->sum+val);

        // lst.stream().max((item1,item2) -> item1.price > item2.price ? 1 : -1).get();

        // Stream<T> filter(Predicate <? super T> predicate)

        List<Integer> numbs = Arrays.asList(1,3,4,5,6,6);
        System.out.println(numbs.stream().findAny()); 
        System.out.println(numbs.stream().allMatch(null));

    }
}
