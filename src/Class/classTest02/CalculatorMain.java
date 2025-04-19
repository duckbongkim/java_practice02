package Class.classTest02;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두번째 수를 입력하세요: ");
        int num2 = scanner.nextInt();

        System.out.println("연산자를 입력하세요(+,-,*,/): ");
        String cal = scanner.next();

        if (cal.equals("+")){
            System.out.println(num1+"+"+num2+"="+Calculator.add(num1,num2));
        } else if (cal.equals("-")) {
            System.out.println(num1+"-"+num2+"="+Calculator.subtract(num1,num2));
        } else if (cal.equals("*")) {
            System.out.println(num1+"*"+num2+"="+Calculator.multiply(num1,num2));
        } else if (cal.equals("/")) {
            System.out.println(num1+"/"+num2+"="+Calculator.divide(num1,num2));
        } else {
            System.out.println("올바른 연산자를 입력하세요.");
        }


    }
}
