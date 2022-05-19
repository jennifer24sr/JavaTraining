package generics;

import java.util.Arrays;

public class GenericArray3<T> {
    private Object[] array;
    private int size,length;

    GenericArray3(){
        length = 10;
        size = 0;
        array = new Object[length];

    }
    public void addElements(int index,T e){
        array[index] = e;
        System.out.println(Arrays.toString(array));
    }
    // public void reCreateOldArray(){}
    public void addToLast(T val){
        System.out.println("Current size " + size);
        if(size >= length-1){
            System.out.println("Size of old array: "+size);
            Object[] newArray = new Object[length+2];
            for(int iterator = 0; iterator < array.length;iterator++){
                newArray[iterator] = array[iterator];
                System.out.println(newArray[iterator]);                System.err.println(iterator);
                System.out.println("Size"+size);
                newArray[newArray.length-1] = val;
                // if(iterator > size){
                //     newArray[iterator] = val;
                // }
                // System.out.println(iterator);
            }
            array = newArray;
            System.out.println("Line 28" + array);
            return;
        }
        
        array[size++] = val;;
        System.out.println("Updated size " + size);

    }
    public T getElement(int index){
        if(index  <= size){
            return (T) array[index];
        }
        return null;
    }
    @Override
    public String toString(){
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        GenericArray3<Integer> obj = new GenericArray3<>();
        for (int i = 0; i < obj.length; i++) {
            obj.addElements(i, i+30);
            obj.size++;
        }
        obj.addToLast(25);
        System.out.println(obj.toString());
        obj.getElement(0);

    }

}

