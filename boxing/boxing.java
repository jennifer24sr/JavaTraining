package boxing;

public class boxing  {
    public static void main(String[] args) {

        Integer num1 = new Integer(10);
        int num2 = num1;
        int i = 4;
        Integer a  = Integer.valueOf(i);
        System.out.println("a " + a);
        int j = a;
        System.out.println("j "+j);
        //Unboxing
        System.out.println("" + num1 + "" +  num2);

        char c = 'C';
        //Autobxing
        Character charac = new Character(c);
        Character charac2 = c;

        System.out.println("c:" + c + "\n" + "charac: " + charac +  "\n" + "charac2: " + charac2);

    }
}
