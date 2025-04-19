package Class.classTest02;

import java.util.Scanner;

public class OddEvenCheckerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.print("숫자를 입력하세요(0을 입력하면 종료됩니다.): ");
            int input = scanner.nextInt();

            if(input == 0){
                System.out.println("프로그램 종료");
                break;
            }

            OddEvenEhecker checker = new OddEvenEhecker(input);
            checker.printResult();
        }






    }
}
