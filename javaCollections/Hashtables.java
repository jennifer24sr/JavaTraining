package javaCollections;

// import java.util.*;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collection;
import java.util.Dictionary;
import java.util.Map;
import java.util.Set;
import java.util.Enumeration;

public class Hashtables<K,V> extends Dictionary<K,V> implements Map<K,V> {
    private static final int SIZE = 10;

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
    private static class HashEntry<K, V> {


        K key;
        V value;

        HashEntry<K, V> next;

        HashEntry(K k, V v) {
            this.key = k;
            this.value = v;
            this.next = null;
        }
        @Override
        public String toString() {
            return "HashEntry{" + "key =" + key + ", value=" + value + ", next=" + next + '}';
        }
        

    }
    
    private final HashEntry[] entries = new HashEntry[SIZE];

    public void puts(K key, V value) {

        int hash = getHash(key);
        
        final HashEntry hashEntry = new HashEntry(key, value);

        if (entries[hash] == null) {
            entries[hash] = hashEntry;
        } else { // collision => chaining
            HashEntry currentEntry = entries[hash];
            while (currentEntry.next != null) {
                currentEntry = currentEntry.next;
            }

            currentEntry.next = hashEntry;
            System.out.println(entries.toString());
        }
    }

    public V gets(K key) {

        int hash = getHash(key);
        
        if (entries[hash] != null) {
            HashEntry currentEntry = entries[hash];

            // Check the entry linked list for matching the given 'key'
            while (currentEntry != null) {                

                if (currentEntry.key.equals(key)) {
                    return (V) currentEntry.value;
                }
                
                currentEntry = currentEntry.next;
            }
        }

        return null;
    }
    private int getHash(K key) {
        System.out.println("Key  "+key.hashCode());        
        return Math.abs(key.hashCode() % SIZE);
    }
    @Override
    public String toString(){
       return Arrays.toString(entries);
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
        Set s = ht.entrySet();
        System.out.println(s);

        ht.remove(3);
        System.out.println(ht);
        System.out.println(ht.get(5)); 
        System.out.println(ht.getOrDefault(5, "Not found"));
        ht.putIfAbsent(5, "Item5");

        Hashtables hashTable = new Hashtables<>();

        hashTable.puts("apple", "apple");
        hashTable.puts("banana", "banana");
        hashTable.puts("orange", "orange");
        hashTable.puts("banana", "banana");

        hashTable.get("orange");
        hashTable.get("banana");

        for(int i = 0;i<hashTable.entries.length;i++){
            if(hashTable.entries[i] != null){
            while(hashTable.entries[i]!=null){
                System.out.print(hashTable.entries[i].key+ "->");
                hashTable.entries[i] = hashTable.entries[i].next;}
            System.out.println("");}
        }

    
    }
    
    
}
