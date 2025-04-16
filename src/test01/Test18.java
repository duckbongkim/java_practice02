package test01;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("아이디를 입력하세요 : ");
            String id = scanner.next();

            if(id.length() >= 5 && id.length() <=12 && id.matches("[a-z0-9]+")){
                System.out.println("올바른 아이디 입니다.");
                break;
            }else {
                System.out.println("올바른 형식이 아닙니다.");
            }
        }
    }
}
