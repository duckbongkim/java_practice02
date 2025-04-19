package Class.classTest02;

public class Calculator {
    private Calculator(){};

    public static int add(int a, int b){
        return a+b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static double divide(int a, int b){
        if(b==0){
            System.out.println("0으로 나눌수 없습니다.");
            return 0;
        }
        return a / b;
    }
}
