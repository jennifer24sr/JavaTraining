
public  class SingletonTest implements Cloneable {
    private static SingletonTest test = null;

    public String s;

    private SingletonTest(){
        System.out.println("Construtor called");
        s = "";
    }
    public static SingletonTest gTest(){
        if(test == null){
            test = new SingletonTest();
        }
        return test;
    }
    public void Test(){
        System.out.println("Tested");
    }
    static{
        System.out.println("Static method executed");
    }
    public static void main(String[] args) {
        SingletonTest obj = new SingletonTest();
        SingletonTest obj2 = new SingletonTest();
    }

}
