package arraylist;
import java.io.*;
import java.util.*;
//ArrayList using Generics
public class ArrayLists<T> {
    private final T[] arr,newArray;
    // private final T[] newArray;
    public final int length;
    
    public ArrayLists(Class <T> type, int length)
    {
        this.arr = (T[]) java.lang.reflect.Array.newInstance(type, length);
        this.length = length;
        newArray = null;
    }

    T getElement(int i){
        return arr[i];
    }
    
    void setElement(int i, T e) {
        arr[i] = e;
    }
    void removeElement(int i){
        int index = i;
        if(arr == null || index <=0 || index >= arr.length ){
            System.out.println("No removal operation can be performed!!");
        }
        else{
            for(int iteratorForOldArray = 0,iteratorForNewArray = 0; i < arr.length ; i++){

                if(iteratorForOldArray == index){
                    continue;
                }
                newArray[iteratorForNewArray++] = arr[iteratorForOldArray];
            }
            System.out.println("New Array: " + Arrays.toString(newArray));
        }
    }
    void popOperation(){
        // T[] popOperation = Arrays.copyOf(arr, arr.length - 1);
        T[] popOp = copyArray(arr,arr.length-1);
        
    }
    public static <T>

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
    
}
class Main
{
    public static void main(String[] args)
    {
        final int length = 5;
 
        ArrayLists<Integer> intArray = new ArrayLists(Integer.class, length);
 
        for (int i = 0; i < length; i++) {
            intArray.setElement(i, i + 1);
        }

        intArray.removeElement(7);
 
        System.out.println(intArray);
 
        ArrayLists<String> strArray = new ArrayLists(String.class, length);
 
        for (int i = 0; i < length; i++) {
            strArray.setElement(i, String.valueOf((char)(i + 65)));
        }
 
        System.out.println(strArray);
    }
}





























    int size = -1;//Duplicate field in ArrayList<R>

    //Constructor
    public ArrayLists(int size){ //Cannot use this in a static content
            this.size = size;
        }

    // ArrayLists arr[] = new ArrayLists[](size);
    private ArrayLists<R> elements;



    private R[] addfunc(){
            for(int i = 0;i <= size;i++){
                    size = size+1;
                    R[size] = i;
        
                    arr.add(i);
                }
            }
        
        
            public static void main(String[] args) {
            
                }
            }
            
            public final int length = -1;
            // private final R[] arr;
            
            //ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
            ArrayList<R> obj = new ArrayList<R>(10);
            public static void name() {
                System.out.println(ArrayList.obj);
            }
            
            public static void main(String[] args) {
                ArrayLists.name();
            }