package test01;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = (int)(Math.random()*100)+1;

        while (true){
            System.out.print("숫자를 맞춰보세요(1~100): ");
            int num1 = scanner.nextInt();

            if(num1>answer){
                System.out.println("너무 큽니다.");
            }
            if(num1<answer){
                System.out.println("너무 작습니다.");
            }
            if(num1 == answer){
                System.out.println("정답입니다.");
                break;
            }
        }
    }
}
