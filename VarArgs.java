import generics.Generics;

public class VarArgs {
    public static void varArgs(int...a){
        System.out.println("Varargs" + a.length);
        for(int i : a){
            System.out.println(i + " ");
        }
    }
    public static void varArgs2(Generics<Integer>...a){
        System.out.println("Varargs" + a.length);
        for(Generics<Integer> i : a){
            System.out.println(i + " ");
        }
    }
}
