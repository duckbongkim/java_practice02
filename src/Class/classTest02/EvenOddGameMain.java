package Class.classTest02;

import java.util.Scanner;

public class EvenOddGameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("홀짝 게임 시작! (나가기 입력 시 종료)");

        while (true) {
            System.out.print("유저 입력(홀수/짝수): ");
            String userChoice = scanner.next();

            if (userChoice.equals("나가기")) {
                System.out.println("게임 종료!");
                break;
            }

            if (!userChoice.equals("홀수") && !userChoice.equals("짝수")) {
                System.out.println("올바른 입력이 아닙니다. 다시 입력하세요.");
                continue;
            }

            System.out.print("유저 숫자 입력(0~9): ");
            int userNum = scanner.nextInt();

            if (userNum < 0 || userNum > 9) {
                System.out.println("0~9 숫자만 입력하세요.");
                continue;
            }

            EvenOddGame game = new EvenOddGame(userChoice, userNum);
            game.printResult();
            System.out.println();
        }
    }
}
