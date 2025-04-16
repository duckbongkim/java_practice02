package method;

public class Method_01 {
    public static void main(String[] args) {
        int sum1= add(5,5);
        System.out.println("결과출력"+sum1);

        int sum2, a=10, b=10;
        sum2 = add(a,b);
        System.out.println("결과 출력"+sum2);

    }
    public static int add(int a, int b){
        System.out.println(a+"+"+b+"연산 수행");
        int result;
        result = a+b;
        return result;
    }
}
