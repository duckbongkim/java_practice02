package test02;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.println("---------------------");
            System.out.println("1.입금|2.출금|3.잔액 조회|4.종료");
            System.out.println("---------------------");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            int amount;

            if (choice == 1){
                System.out.print("입금액을 입력하세요: ");
                amount = scanner.nextInt();
                balance = deposit(balance, amount);

            } else if (choice == 2) {
                System.out.print("출금액을 입력하세요: ");
                amount = scanner.nextInt();
                balance = withdraw(balance, amount);

            } else if (choice == 3) {
                System.out.println("현재 잔액: "+balance);
            } else if (choice == 4) {
                System.out.println("시스템을 종료 합니다.");
                break;
            } else {
                System.out.println("잘못된 선택");
            }

        }
    }

    public static int deposit(int balance, int amount){
        balance += amount;
        System.out.println(amount+"원 입금");
        return balance;
        }

    public static int withdraw(int balance, int amount){
        if(balance >= amount){
            balance-=amount;
            System.out.println(amount+"원 출금");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
        return balance;
    }

    }

