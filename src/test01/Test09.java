package test01;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        
        if(age>=20){
            System.out.println("성인");
        } else{
            System.out.println("성인이 아님");
        }
    }
}
