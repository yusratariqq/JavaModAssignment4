import java.util.Collection;

public class CollectionPrinter {
    public static <T> void printCollection(Collection<T> collection) {
        for (T element : collection) {
            System.out.println(element);
        }
    }
}