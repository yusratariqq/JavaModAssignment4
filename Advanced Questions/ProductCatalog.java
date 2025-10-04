import java.util.*;

public class ProductCatalog {
    public static void main(String[] args) {
        TreeMap<String, Double> products = new TreeMap<>();
        products.put("Laptop", 999.99);
        products.put("Mouse", 25.50);
        products.put("Keyboard", 75.00);
        products.put("Monitor", 299.99);
        
        System.out.println("Products in sorted order:");
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }
}