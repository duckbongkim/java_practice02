package Class.StaticEx;

public class MathArrayMain {
    public static void main(String[] args) {
        int[] arrays = {1,4,9,3,2};

        System.out.println("sum: "+MathArrayUtils.sum(arrays));
        System.out.println("average: "+MathArrayUtils.average(arrays));
        System.out.println("min: "+MathArrayUtils.min(arrays));
        System.out.println("max: "+MathArrayUtils.max(arrays));
    }
}
