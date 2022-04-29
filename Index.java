
import java.util.Arrays;

public class Index {
    public static void main(String[] args) {
        int[] arr = new int[]{1,9,3,9,2,4,9};
        for(int j = 1; j<=2; j++){
            for(int i = arr.length-1; i > 0; i--){
                if(arr[i] == 9){
                        int temp = arr[i-1];
                        arr[i-1] = arr[i];
                        arr[i] = temp;
                        System.out.println("temp :" + temp);
                    }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}