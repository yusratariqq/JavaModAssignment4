import java.util.*;

public class TodoList {
    private List<String> tasks;
    
    public TodoList() {
        tasks = new ArrayList<>();
    }
    
    public void addTask(String task) {
        tasks.add(task);
    }
    
    public void removeTask(String task) {
        tasks.remove(task);
    }
    
    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}