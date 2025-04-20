package Class.classTest02;

import java.util.Scanner;

public class EvenOddBattleGameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("홀짝 맞추기 게임 시작(나가기 입력시 종료)");

        while(true){
            System.out.println("유저 선택(홀수/짝수): ");
            String userChoice = scanner.next();

            if(userChoice.equals("나가기")){
                System.out.println("프로그램 종료");
                break;
            }

            EvenOddBattleGame game = new EvenOddBattleGame(userChoice);
            game.printResult();
            System.out.println();
        }

    }
}
