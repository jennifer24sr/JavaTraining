package generics;

import java.util.Arrays;
public class GenericArray2<T> {
    private Object[] array;
    private int size;

    GenericArray2(){
        // length = 0;
        size = 0;
        array = new Object[5];

    }
    public void addElements(int index,T e){
        array[index] = e;
        System.out.println(Arrays.toString(array));
    }
    // public void reCreateOldArray(){}
    public void addToLast(T val){
        System.out.println("Current size " + size);
        if(size >= array.length){
        	// length = size ++;
            Object[] newArray = new Object[array.length + 5];
            System.out.println("NewArray length = " + newArray.length);
            for(int iterator = 0; iterator < array.length;iterator++){
                newArray[iterator] = array[iterator];
                System.out.println(newArray[iterator]);                
                System.out.println("Size"+size);
                // newArray[newArray.length -1] = val;
            
            }
            array = newArray;
            System.out.println("Line 28" + array);
            // return;
        }
        
        array[size++] = val;;
        System.out.println("Updated size " + size);

    }
    @SuppressWarnings("unchecked")
	public T getElement(int index){
    	if(index > array.length) {
    		throw new ArrayIndexOutOfBoundsException();
    	}
        if(index  <= size){
        	System.out.println((T)array[index]);
            return (T)array[index];
        }
        return null;
    }
    public T removeElement(int index) {
    	Object[] afterRemovingElement = new Object[array.length - 1];
    	int j=0;
        for(int i=0;i<size;i++){
            if(i == index){
                continue;
            }
            afterRemovingElement[j++]=array[i];
            // if(i!=j){
            //     k++;
            // }
        }
        array = afterRemovingElement;
        size--;
        // System.out.println("After"+" "+ Arrays.toString(afterRemovingElement));
        return null;
    }
    public T replaceElement(int index,T val) {
    	if(array[index] == null) {
    		throw new ArrayIndexOutOfBoundsException();
    	}
    	else {
    		array[index] = val;
    		System.out.println(Arrays.toString(array));
    	}
    	return null;
    }
    public T insertElement(int index,T val) {
    	Object[] AfterInsertingElement = new Object[array.length+1];
        int j = 0;
    	for(int i = 0;i <= size;) {
//    		array[i] = AfterInsertingElement[i + 1];
    		if(j == index) {
    			AfterInsertingElement[j++] = val;
    		}
    		else {
    			
    			AfterInsertingElement[j++] = array[i++];
    		}

    		
    	}
        size++;
    	// AfterInsertingElement[index] = val;
    	array = AfterInsertingElement;
    	// System.out.println("After Inserting Element" + Arrays.toString(array));
    	return null;
    }
    public <T> void genericMethod(T[] elements){
        for(T element : elements){
            System.out.println(element);
        }
    }
    @Override
    public String toString(){
        // return Arrays.toString(array);
        String toreturn = "";
        for(int i = 0;i < size;i++){
            // System.out.println(array[i]);
            toreturn += array[i] + " ";
        }
        return toreturn;
    }

    public static void main(String[] args) {
        GenericArray2<Integer> obj = new GenericArray2<>();
        // for (int i = 0; i < obj.length; i++) {
        //     obj.addElements(i, i+30);
        //     obj.size++;
        // }
        obj.addToLast(25);
        obj.addToLast(14);
        obj.addToLast(100);
        obj.addToLast(98);
        obj.addToLast(13);
        obj.addToLast(95);
        System.out.println(obj.toString());
        // obj.getElement(0);
        obj.insertElement(2, 15);
        System.out.println(obj.toString());
        obj.removeElement(3);
        System.out.println(obj.toString());
        obj.addToLast(45);
        obj.addToLast(467);
        obj.addToLast(47);
        obj.addToLast(46);
        System.out.println(obj.toString());
        // obj.removeElement(8);
        // obj.replaceElement(0, 8);
        // obj.insertElement(4, 54);
        // obj.insertElement(6, 89);

    }

}
