import java.util.*;

public class MultiMap<K, V> {
    private Map<K, List<V>> map;
    
    public MultiMap() {
        map = new HashMap<>();
    }
    
    public void put(K key, V value) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }
    
    public List<V> get(K key) {
        return map.getOrDefault(key, new ArrayList<>());
    }
}