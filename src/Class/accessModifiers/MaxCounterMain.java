package Class.accessModifiers;

public class MaxCounterMain {
    public static void main(String[] args) {
        MaxCounter max = new MaxCounter(5);
        max.increment();
        max.increment();
        max.increment();
        max.increment();
        max.increment();
        max.increment();

        int counter = max.getCount();
        System.out.println(counter);
    }
}
