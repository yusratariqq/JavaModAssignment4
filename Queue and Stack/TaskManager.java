import java.util.*;

public class TaskManager {
    public static void main(String[] args) {
        PriorityQueue<String> tasks = new PriorityQueue<>();
        tasks.add("Low priority task");
        tasks.add("High priority task");
        tasks.add("Medium priority task");
        
        while (!tasks.isEmpty()) {
            System.out.println("Processing: " + tasks.poll());
        }
    }
}