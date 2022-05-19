package collections;
import java.util.*;

public class CollectionsBasics {
    public static void main(String []args){
        List<String> list = new ArrayList<>();
        List<Integer> linkedlst  = new LinkedList<>();
        list.add("Item1");
        list.add("Item2");
        list.add("Item2");
        linkedlst.add(1);
        Stack<Float> stk = new Stack<>();
        stk.push(9.0f);
        stk.pop();
        PriorityQueue<String> que = new PriorityQueue<String>();
        que.add("Heleo");
        que.add("World");
        que.add("Hiii");
        TreeSet<Boolean> ts = new TreeSet<Boolean>();
        ts.add(true);
        ts.add(true);
        ts.add(false);

        que.peek();
        que.element();
        // que.remove();
        // que.poll();

        Iterator<String> queIt = que.iterator();
        while(queIt.hasNext()){
            System.out.println();
        }
        

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
    }
}
