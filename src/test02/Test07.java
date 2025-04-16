package test02;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        int hp = 100;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("----------");
            System.out.println("1.회복|2.공격받기|3.현재HP|4.종료");
            System.out.println("----------");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            int amount;

            if(choice == 1){
                System.out.print("회복할 체력을 입력하세요: ");
                amount = scanner.nextInt();
                hp = deposit(hp,amount);
            } else if (choice == 2) {
                System.out.print("공격받을 데미지를 입력하세요: ");
                amount = scanner.nextInt();
                hp = withdraw(hp, amount);
            } else if (choice == 3) {
                System.out.println("현재 체력: "+hp);
            } else if (choice == 4) {
                System.out.println("프로그램 종료");
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }

    public static int deposit(int hp, int amount){
        hp += amount;
        System.out.println(amount+"만큼 체력이 회복되었습니다."+"현재채력"+hp);
        return hp;
    }

    public static int withdraw(int hp, int amount){
        if(hp>=amount){
            hp -= amount;
            System.out.println(amount+"만큼 공격 받았습니다."+"현재체력"+hp);
        } else {
            System.out.println("hp보다 더 강한 공격을 받음, 사망");
        }
        return hp;
    }
}
