package algo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

    int capacity;
    Map<Integer, Node> map = new LinkedHashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int value) {
        if(!map.containsKey(value)){
            return -1;
        }
        Node node = map.get(value);
        deleteNode(node);
        insertNode(node);
        return node.value;
    }

    private void insertNode(Node node) {
        map.put(node.value, node);
    }

    private void deleteNode(Node node) {
        map.remove(node.value);
    }

    public void set(int value) {
        if(map.containsKey(value)){
            get(value);
            return;
        }
        if(map.size()<capacity){
            map.put(value, new Node(value));
            return;
        }
        Node next = map.values().iterator().next();
        deleteNode(next);
        insertNode(new Node(value));
    }

    public void print() {
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key).value);
        }
    }

    public static void main(String args[]){
        LRUCache cache = new LRUCache(3);
        cache.set(3);
        cache.print();
        System.out.println("====================================");

        cache.set(6);
        cache.print();
        System.out.println("====================================");

        cache.set(9);
        cache.print();
        System.out.println("====================================");

        cache.set(7);
        cache.print();
        System.out.println("====================================");

        cache.set(9);
        cache.print();
        System.out.println("====================================");
    }

}


