package Operator;

public class AssignmentOperator02 {
    public static void main(String[] args) {
        int a =20, b=7, c=30, d=2, e=8;
        int x= a/b+c*d%e;
        System.out.println("x = " + x);

        boolean y = a>b+c && d<8;
        System.out.println("y = " + y);

        int z =100;
        z+= a+b-c*d/e;
        System.out.println("z = " + z);
    }
}
