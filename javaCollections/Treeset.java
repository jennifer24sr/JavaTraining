package javaCollections;

import java.util.AbstractSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Treeset<E> extends AbstractSet<E> implements Set<E>,NavigableSet<E>{

    @Override
    public Comparator<? super E> comparator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E first() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E last() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E lower(E e) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E floor(E e) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E ceiling(E e) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E higher(E e) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E pollFirst() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E pollLast() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public NavigableSet<E> descendingSet() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterator<E> descendingIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public NavigableSet<E> headSet(E toElement, boolean inclusive) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SortedSet<E> subSet(E fromElement, E toElement) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SortedSet<E> headSet(E toElement) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SortedSet<E> tailSet(E fromElement) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<String>();  
        ts.add("One");
        ts.add("tWOooooo");
        ts.add("Three");
        ts.add("four");
        System.out.println(ts);

        Iterator it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next() + " " + it.next().hashCode());
        }
        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());
        System.out.println("Headset" + " " + ts.headSet("four" , true));
        System.out.println("Subset" + ts.subSet("One",false, "four",true));

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(1234);
        ts2.add(234);
        ts2.add(134);
        ts2.add(123);

        System.out.println(ts2.pollFirst() + " " +ts2.pollLast() );

    }
    
}
