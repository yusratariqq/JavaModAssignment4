import java.util.*;

public class ListPerformance {
    public static void main(String[] args) {
        int size = 100000;
        
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arrayList.add(0, i);
        }
        long arrayListTime = System.currentTimeMillis() - startTime;
        
        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            linkedList.add(0, i);
        }
        long linkedListTime = System.currentTimeMillis() - startTime;
        
        System.out.println("ArrayList add at beginning: " + arrayListTime + "ms");
        System.out.println("LinkedList add at beginning: " + linkedListTime + "ms");
    }
}