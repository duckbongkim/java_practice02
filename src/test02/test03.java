package test02;

public class test03 {
    public static void main(String[] args) {
        System.out.println("평균값 1: "+avg(1,2,3));
        System.out.println("평균값 2: "+avg(4,5,6));
    }

    public static double avg(int a, int b, int c){
        int sum = a+b+c;
        double result = sum / 3.0;
        return result;
    }
}
