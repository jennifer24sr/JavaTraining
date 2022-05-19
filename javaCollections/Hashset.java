package javaCollections;
import java.util.*;

public class Hashset<E> extends AbstractSet<E> implements Set<E> {

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }
    public static void main(String args[]){
        HashSet<String> hash = new HashSet<>();
        // hash.add('A');
        // hash.add('B');
        // hash.add('C');
        // hash.add('D');

        hash.add("One");
        hash.add("two");
        hash.add("three");
        hash.add("four");
        hash.add("four");

        // LinkedList<String> linkedLst = new LinkedList<>();
        // linkedLst.add("Item1");
        // linkedLst.add("Item2");
        // linkedLst.add("Item3");

        // hash.removeIf(str -> str.contains("four"));
        // HashSet<String> hashTwo = new HashSet<>(linkedLst);
        // hashTwo.addAll(hash);
        // hashTwo.add("hashTwo");
        // System.out.println(hashTwo);

        Iterator iter = hash.iterator();
        while(iter.hasNext()){
            System.out.println(iter.hashCode() + " " +iter.next().hashCode());
        }
        // Iterator iter2 = hashTwo.iterator();
        // while(iter2.hasNext()){
        //     System.out.println(iter2 + " iter2  " +iter.next());
        // }


    }
    
}
