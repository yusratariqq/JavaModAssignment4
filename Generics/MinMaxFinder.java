import java.util.List;

public class MinMaxFinder<T extends Comparable<T>> {
    private List<T> elements;
    
    public MinMaxFinder(List<T> elements) {
        this.elements = elements;
    }
    
    public T findMin() {
        if (elements.isEmpty()) return null;
        T min = elements.get(0);
        for (T element : elements) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }
    
    public T findMax() {
        if (elements.isEmpty()) return null;
        T max = elements.get(0);
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}