package test01;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("이메일을 입력해주세요: ");
            String email = scanner.next();

            if(email.contains("@") && email.contains(".")){
                System.out.println("올바른 이메일: "+ email);
                break;
            } else {
                System.out.println("올바른 이메일이 아닙니다.: "+email);
            }
        }
    }
}
