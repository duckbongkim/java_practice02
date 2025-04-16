package Operator;

public class AssignmentOperator {
    public static void main(String[] args) {
        int a =30, b= 11, c=7, d=10;
        a += b+c-d;
        System.out.println("a = " + a);

        a%=b-c;
        System.out.println("a = " + a);
    }
}
