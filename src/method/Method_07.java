package method;

public class Method_07 {
    public static void main(String[] args) {
        int num1=5;
        System.out.println("1. changeNumbers 호출전,num1: "+num1);
        changeNumbers(num1);
        System.out.println("4. changeNumbers 호출 후,num1: "+num1);
    }

    public static void changeNumbers(int num2){
        System.out.println("2. numbers 변경 전,num2: "+num2);
        num2= num2 * 2;
        System.out.println("3. numbers 변경 후,num2: "+num2);
    }
}
