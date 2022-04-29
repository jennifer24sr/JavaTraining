import java.util.*;
public class Test {
    
    public static void main(String[] args) {


        int n;  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");  

        n=sc.nextInt();  
        int[] array = new int[10];  
        System.out.println("Enter the elements of the array: ");  

        for(int i=0; i<n; i++) {

            array[i]=sc.nextInt();  
        }  

        int[] newArray = new int[15];
        System.arraycopy(array, 0, newArray, 0, array.length);
        

        Test obj = new Test();
        obj.addX(n, newArray, 50);


        System.out.println(Arrays.toString(newArray));
    }

    public int[] addX(int n, int arr[], int x) {
         
        for (int i = 0; i < n; i++)
            arr[i] = arr[i];

        arr[n] = x;
        return arr;
    }
       
}
