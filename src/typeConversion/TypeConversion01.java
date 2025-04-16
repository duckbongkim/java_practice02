package typeConversion;

public class TypeConversion01 {
    public static void main(String[] args) {
        long x = 10000L;
        float y;

        y= x;
        System.out.println(y);

        double z;
        z=x;
        System.out.println(z);

        char a = 'a';
        int b;
        b=a;
        System.out.println(b);
        System.out.println((char)b);


    }
}
