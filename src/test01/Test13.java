package test01;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("첫번째 숫자(exit 입력시 종료): ");
            String num1 = scanner.next();
            if(num1.equals("exit")){
                System.out.println("프로그램 종료");
                break;
            }

            System.out.print("추번째 숫자: ");
            String num2 = scanner.next();

            System.out.print("연산자(+ - * /)선택: ");
            String str = scanner.next();

            if(str.equals("+")){
                System.out.println("num1"+str+"num2"+"="+(Integer.parseInt(num1)+Integer.parseInt(num2)));
            } else if (str.equals("-")) {
                System.out.println("num1"+str+"num2"+"="+(Integer.parseInt(num1)-Integer.parseInt(num2)));
            } else if (str.equals("*")) {
                System.out.println("num1"+str+"num2"+"="+(Integer.parseInt(num1)*Integer.parseInt(num2)));
            } else if (str.equals("/")) {
                if(num1.equals("0")){
                    System.out.println("0으로 나눌수 없습니다.");
                }else {
                    System.out.println("num1" + str + "num2" + "=" + (Integer.parseInt(num1) * Integer.parseInt(num2)));
                }
            } else {
                System.out.println("올바른 연산자를 입력해주세요");
            }

        }
    }
}
