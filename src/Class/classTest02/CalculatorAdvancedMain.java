package Class.classTest02;

import java.util.Scanner;

public class CalculatorAdvancedMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("첫 번째 숫자를 입력(0을 입력시 종료): ");
            int num1 = scanner.nextInt();
            if(num1==0){
                break;
            }

            System.out.print("두 번째 숫자를 입력: ");
            int num2 = scanner.nextInt();

            System.out.println("연산자(+,-,*,/,%) 입력: ");
            String input = scanner.next();

            if(input.equals("+")){
                System.out.println(num1+"+"+num2+"="+CalculatorAdvanced.add(num1,num2));
                } else if (input.equals("-")) {
                System.out.println(num1+"-"+num2+"="+CalculatorAdvanced.subtract(num1,num2));
            } else if (input.equals("*")) {
                System.out.println(num1+"*"+num2+"="+CalculatorAdvanced.multiply(num1,num2));
            } else if (input.equals("/")) {
                System.out.println(num1+"/"+num2+"="+CalculatorAdvanced.divide(num1,num2));
            } else if (input.equals("%")) {
                System.out.println(num1+"%"+num2+"="+CalculatorAdvanced.modulo(num1,num2));
            } else {
                System.out.println("잘못된 입력입니다.");
            }

        }
        }
    }

