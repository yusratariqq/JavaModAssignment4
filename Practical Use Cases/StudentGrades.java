import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        TreeMap<String, String> grades = new TreeMap<>();
        grades.put("John", "A");
        grades.put("Alice", "B");
        grades.put("Bob", "A+");
        
        System.out.println("All students: " + grades);
        System.out.println("Alice's grade: " + grades.get("Alice"));
    }
}