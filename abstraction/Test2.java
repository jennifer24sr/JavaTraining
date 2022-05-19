package abstraction;

class Test2 extends Test implements Cloneable{
    int id;
    final String fonalString;
    final int IIRJTI = 10;
    // Test2 obj = new Test();
    public void Shapes() {
        System.out.println("TESt2 exceuted");
    }
    String color = "white";
    Double doub;
    static{
        System.out.println("static block1");
    }
    static{
        System.out.println("static block2");
    }
    static{
        System.out.println("static block3");
    }
    public void name() {
        System.out.println("ehlo");
    }
    public void name(int hello , long b) {
        System.out.println(hello);
    }
    public void name(long hello , int a) {
        System.out.println("Long");
        
    }
    public void name(float a) {
        System.out.println(a);
        System.out.println(color);
        System.out.println(super.color);
        super.name();
        System.out.println(doub);
    }
    {doub = 9.00d;}
    Test2(int id){
        super();
        System.out.println("Test2 constructor invoked");
        fonalString = "hello";
        this.id = id;
    }
    public Object clone() throws CloneNotSupportedException{
        System.out.println(super.clone());
        return super.clone();
    }
    // public final class getClass();
    public static void main(String[] args) {
        // Test2 obj  = new Test2();
        Test2 cloneobj = new Test2(74);
        try {
            Test2 testclone = (Test2)cloneobj.clone();
            System.out.println("Cloned object " + testclone);
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // obj.name();
        // obj.funcc();
        Test tesobj;
        // System.out.println(tesobj instanceof Test2);
        // tesobj  = new Test2();
        // tesobj.Shapes();
        // tesobj = new Test3();
        // tesobj.Shapes();

        // obj.name(89 , 67);//ambiguous
        // obj.name(9.00f);
        Object ob = new Object();
        System.out.println(ob.getClass());
        System.out.println(ob.hashCode());
        // System.out.println(ob.equals(obj));
        
    }
}
