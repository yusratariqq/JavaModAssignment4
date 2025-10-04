

public class Main {
    public static void main(String[] args) {
        System.out.println("=== GENERICS AND COLLECTIONS DEMO ===");
        
        // Test Box
        Box<String> box = new Box<>();
        box.addItem("Test Item");
        System.out.println("Box: " + box.getItem());
        
        // Test ArrayList
        ArrayListDemo.demo();
    }
}