package abstraction;
import java.lang.Cloneable;

class Test{
    Test(){
        System.out.println("Parent constructor invoked");
    }
    static{
        }
    int i = 5;
    Integer j = i;
    public Integer funcc(){
        System.out.println("Doney");
        return i;
    }
    public void name() {
        System.out.println("supers");
    }
    public void Shapes(){
        System.out.println("Super class");
    }
    String color = "black";
    float b = (float)i;
    float c = i;
    int d = 8;
    int e = ~d;
    byte dd = (byte)i;
    // public Object clone() throws CloneNotSupportedException{
        //     Test obj = (Test)super.clone();
        //     obj.tes = new Test();
        //     return obj;
        // }
        public static void main(String[] args) {
        Test tes = new Test();
        // Test ehlo = new Test2();//upcasting
        System.out.println(tes.b);
        System.out.println(tes.dd);
        System.out.println(tes.e);
        System.out.println(tes.c);
        System.out.println(tes.funcc());
        // System.out.println(obj instanceof Test3);
        // Test t3 = (Test2)t1.clone();
    }

}
