package abstraction;
import java.lang.Cloneable;

public class Test{
    int i = 5;
    Integer j = i;
    public Integer funcc(){
        System.out.println("Doney");
        return i;
    }
    Test tes = new Test();
    public Object clone() throws CloneNotSupportedException{
        Test obj = (Test)super.clone();
        obj.tes = new Test();
        return obj;
    }
    public static void main(String[] args) {
        // System.out.println(tes.funcc());
        Test t3 = (Test2)t1.clone();
    }

}
