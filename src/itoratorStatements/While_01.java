package itoratorStatements;

public class While_01 {
    public static void main(String[] args) {
        int a= 1;
        int sum=0;
        System.out.println(a);
        while (a <=10){
            sum = sum+a;
            a = a+1;
            System.out.println("a:"+a);
            System.out.println("sum:"+sum);
        }
        System.out.println("최종 sum:"+sum);
    }
}
