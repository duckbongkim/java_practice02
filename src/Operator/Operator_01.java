package Operator;

public class Operator_01 {
    public static void main(String[] args) {
        int a = 10, b;
        b= a++;

        System.out.println("a:" + a);
        System.out.println("b:"+b);

        int a1 = 10,c;
        c = ++a1;
        System.out.println("a1:" + a1);
        System.out.println("c:"+c);
    }
}
