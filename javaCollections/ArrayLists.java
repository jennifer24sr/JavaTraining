package javaCollections;
import java.io.Serializable;
import java.util.*;

public class ArrayLists<E> extends AbstractList<E> implements List<E>, Cloneable,Serializable,RandomAccess {

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    public static void main(String[] args) {
        
        List<String> arrlst = new ArrayList();
        // arrlst.add("apple");
        // arrlst.add("banana");
        // arrlst.add("grapes");
        // arrlst.add("lemon");
        // arrlst.add("brinjal");
        // arrlst.add(2, "grapes");

        Collections.sort(arrlst);

        // // ListIterator itr3 = arrlst.descendingIterator();

        // ListIterator<String> itr = arrlst.listIterator(arrlst.size());
        // while(itr.hasPrevious()){
        //     System.out.println(itr + " " +itr.previous());
        // }
        // ArrayList<String> arrlst2 = new ArrayList<String>();
        // arrlst2.add("Mango");
        // arrlst2.add("Orange");
        // arrlst.remove("grapes");
        // String x = "lemon";
        // for(int i = 0;i<=arrlst.size();i++){
        //     if(arrlst.get(i).equals(x)){
        //         System.out.println("Yes");
        //     }
        // }
        // System.out.println("arr1" + arrlst);
        // // arrlst.add(null);
        // // arrlst.add(null);
        // // arrlst.add(null);
        // System.out.println("arr1" + arrlst);

        // System.out.println("Retaining elements" + arrlst.retainAll(arrlst2)); 
        // // try{
        // //     arrlst.remove(7);//IndexOutofBoundsException

        // // }
        // // catch(IndexOutOfBoundsException e){
        // //     System.out.println("Index Out of Bounds Exception");
        // // }
        String[] test = {"One","Two"};
        List<String> i = Arrays.asList(test);
        // i.add("Three");
        System.out.println(i);
        for(String iter : i ){
            System.out.println(iter);
        }
        
    }
    
}
