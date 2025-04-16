package test01;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력해줘: ");
        int num1 = scanner.nextInt();
        System.out.println();

        System.out.print("두번째 숫자를 입력해줘: ");
        int num2= scanner.nextInt();
        System.out.println();

        System.out.print("연산자를 입력해줘(+ - * /): ");
        String str = scanner.next();
        
        if(str.equals("+")){
            System.out.println(num1+num2);
        } else if (str.equals("-")) {
            System.out.println(num1-num2);
        } else if (str.equals("*")) {
            System.out.println(num1*num2);
        } else if (str.equals("/")) {
            System.out.println(num1/num2);
        } else {
            System.out.println("올바른 연산자를 입력해주세요");
        }
    }
}
