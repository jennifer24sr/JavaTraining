package abstraction;

import interfaces.Interface2;

public class Test3 extends AbstarctClassTest{
    int id;
    String name;
    String hello;
    public void Shapes() {
        System.out.println("TEst3 executed");
    }
    Test3(int ids, String names){
        this();
        id = ids;
        name = names;
    }
    Test3 fun(){
        System.out.println("fun executed");
        System.out.println(this);
        return this;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    // Test3(Test3 yy){
    //     id = yy.id;
    //     name = yy.name;
    // }
    Test3(int iddj,String jrei,String i){
        // this(ids,names);
        hello = i;
    }
    Test3(){
        System.out.println("Default constructor called");
    }
    public  void name() {
        System.out.println(id+" "+name);
        
    }
    public void names() {
        System.out.println("Method invoked");
        // name(this);
    }
    public void abstractmethod(){
        System.out.println("InterfaceTest");
    }
    public static void main(String[] args) {
        Test3 objec = new Test3(986, "Hello");
        Test3 objj = new Test3(3673,"heelooo","dsh");
        
        // Test3 objec2 = objec;
        // objec2.name = "29";
        Test3 obj = new Test3();
        obj.id = objec.id;
        objec.name();
        obj.name();
        obj.fun().name();
        obj.naming();
        System.out.println(obj instanceof Test3);
        // System.out.println(obj instanceof Test);
        // objec2.name();
        obj.abstractmethod();
    }
    @Override
    public void naming() {
        // TODO Auto-generated method stub
        System.out.println("AbstractClass called");
    }
}
