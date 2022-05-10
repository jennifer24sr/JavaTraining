public class Review3{

class Review2 implements Cloneable{
    int id;
    String name;
    public Review2(){

    }
    public Review2(Review2 review){
        this.name = "Jeen";
        this.id = review.id +1;
    }
    public Review2(int id,String name){
        this.id = id;
        this.name = name;
    }
    
}

final static String cmnpyName = "Zerplabs";
    public static void main(String[] args) {
        // Review2 review = new Review2(89,"Sowmya");
        // Review2 review2 = new Review2(review);
        // try {
        //     Review2 review2 = (Review2) review.clone();
        //     review.name = "Hello";
        //     System.out.println("Same" + review.name + " " +review2.name);
        // } catch (CloneNotSupportedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
    Names name = Names.TESTONE;
    System.out.println(name);
    }
    public static void Test(){

        System.out.println(cmnpyName);
    }
    enum Names {
        TESTONE,
        TESTTWO,
        TESTTHREE;
    }

}
// public class Test{
//     public Test(){

//     }
//     public Test(Test test){

//     }
//     Test test = new Test();
//     Test test2 = test;
//     if(test == test2){
//         System.out.println("Same");
//     }
// }
    

class GenericArray<T>{
    T id;
    public static void main(String[] args) {
        
        GenericArray<Integer> obj1 = new GenericArray<>();
        GenericArray<String> obj2 = new GenericArray<>();
        obj1.id = 10;
        obj2.id = "10";
        obj2.id++;
    }


}