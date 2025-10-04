public class NumberContainer<T extends Number> {
    private T number;
    
    public NumberContainer(T number) {
        this.number = number;
    }
    
    public double square() {
        return number.doubleValue() * number.doubleValue();
    }
}