public class Java001 {
    public static void main(String[] args) {
        int a = 10, b=20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a+b;
        System.out.println("a + b = " + a);

        System.out.println(a);

        b=a+b;
        System.out.println("a + b = " + b);
    }
}
