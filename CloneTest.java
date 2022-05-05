public class CloneTest implements Cloneable {
    public  int num1;
    public  int num2;

    CloneTest(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    CloneTest test = new CloneTest(0, 0);
    //Copy Constructor

    CloneTest (CloneTest test){
        num1 = test.num1;
        num2 = test.num2;
        System.out.println("Copy Constructor Invoked");
        System.out.println(""+num1+""+num2);
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }


}