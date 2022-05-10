package reviewexercise;
//Find the last occurance of a substring in a string
public class ExcerciseTwo {
    public ExcerciseTwo(){
        System.out.println("Constructor initiated");
    }
    public void findSubString(String str , String substr){
        // System.out.println(str.lastIndexOf(substr));
        if(str.lastIndexOf(substr) == -1){
            System.out.println("No such substring found");
        }
        else{
            System.out.println("Index " + str.lastIndexOf(substr));
        }
    }

    public static void main(String[] args) {
        String str = "jiaibakajpoabcuyrijoijabcyoiweabc";
        String substr = "abc";
        ExcerciseTwo obj = new ExcerciseTwo();
        obj.findSubString(str, substr);
    }
}
