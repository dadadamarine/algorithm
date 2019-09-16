package algo.data2;

import java.util.LinkedHashSet;
import java.util.Set;

public class LRU {

    int capacity;
    private Set<Integer> set = new LinkedHashSet<>();

    public LRU(int capacity){
        this.capacity = capacity;
    }

    public int get(int value){
        if(!set.contains(value)){
            return Integer.MIN_VALUE;
        }
        deleteNode(value);
        insertNode(value);
        return value;
    }

    private void deleteNode(int value) {
        set.remove(value);
    }

    private void insertNode(int value) {
        set.add(value);
    }

    public void cache(int value){
        if(set.contains(value)){
            get(value);
            return;
        }
        if(set.size()>=capacity){
            Integer first = set.iterator().next();
            deleteNode(first);
            insertNode(first);
            return;
        }
        insertNode(value);
    }
}
