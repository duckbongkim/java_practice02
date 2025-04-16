package test01;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("비밀번호를 입력하세요(1234 입력시 종료): ");
        String password = scanner.nextLine();

        if(password.equals("1234")){
            System.out.println("비밀번호 확인");
        }else {
            System.out.println("비밀번호가 틀렸습니다.");
        }
    }
}
