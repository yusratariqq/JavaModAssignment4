import java.util.*;

public class StudentSorter {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 85));
        students.add(new Student("Alice", 92));
        students.add(new Student("Bob", 78));
        
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s2.getMarks(), s1.getMarks());
            }
        });
        
        System.out.println("Sorted by marks: " + students);
    }
}