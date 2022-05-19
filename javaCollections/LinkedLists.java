package javaCollections;

import java.io.Serializable;
import java.util.*;

public class LinkedLists<E> extends AbstractSequentialList<E> implements List<E>,Deque<E>,Cloneable,Serializable {

    @Override
    public void addFirst(E e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addLast(E e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean offerFirst(E e) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean offerLast(E e) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public E removeFirst() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E removeLast() {
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
    public E getFirst() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E getLast() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E peekFirst() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E peekLast() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean offer(E e) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public E remove() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E poll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E element() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void push(E e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public E pop() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterator<E> descendingIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }
    public static void main(String []args){
        LinkedList<Integer> lnkdlst = new LinkedList<Integer>();
        lnkdlst.add(1234567);
        lnkdlst.add(12367);
        lnkdlst.add(34567);
        lnkdlst.add(34907);

        Iterator itr = lnkdlst.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        LinkedList<Integer> linklist2 = new LinkedList<>();
        linklist2.add(1);
        linklist2.add(2);
        linklist2.add(3);
        lnkdlst.addAll(0, linklist2);
        lnkdlst.addFirst(728752);
        linklist2.addLast(87227);
        Iterator itr2 = linklist2.iterator();

        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        lnkdlst.removeAll(linklist2);
        linklist2.remove(2);
        linklist2.clear();
        System.out.println("New Linked List2" + linklist2);

        Iterator itr3 = lnkdlst.descendingIterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }
        LinkedList<String> storesNUll = new LinkedList<>();
        storesNUll.add((null));
        storesNUll.add((null));
        storesNUll.add((null));

        System.out.println(storesNUll);


    }
}

    