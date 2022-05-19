package javaCollections;

// import java.util.*;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Collection;
import java.util.Dictionary;
import java.util.Map;
import java.util.Set;
import java.util.Enumeration;

public class Hashtables<K,V> extends Dictionary<K,V> implements Map<K,V> {

    @Override
    public boolean containsKey(Object key) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Set<K> keySet() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Collection<V> values() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Enumeration<K> keys() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Enumeration<V> elements() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public V get(Object key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public V put(K key, V value) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public V remove(Object key) {
        // TODO Auto-generated method stub
        return null;
    }
    

    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(1, "Item1");
        ht.put(2, "Item2");
        ht.put(3, "Item3");
        ht.put(4, "Item4");
        
        for(Map.Entry entry : ht.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue() + entry.getValue().hashCode());
        }
        ht.remove(3);
        System.out.println(ht);
        System.out.println(ht.get(5)); 
        System.out.println(ht.getOrDefault(5, "Not found"));
        ht.putIfAbsent(5, "Item5");
    
    }
    
    
}
