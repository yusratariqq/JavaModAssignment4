

import java.util.*;

public class ArrayListDemo {
    public static void demo() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        System.out.println("ArrayList Demo:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public static void main(String[] args) {
        demo();
    }
}