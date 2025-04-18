package Class.classTest;

import java.util.Scanner;

public class DiceGameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("입력: ");
            String input = scanner.next();

            if(input.equals("나가기")){
                System.out.print("게임 종료");
                break;
            }
            
            try {
                int userDice = Integer.parseInt(input);
                
                if (userDice < 1 || userDice >6){
                    System.out.println("1~6의 숫자로 입력하세요");
                    continue;
                }
                
                DiceGame game = new DiceGame(userDice);
                game.printResult();
            } catch (NumberFormatException e){
                System.out.println("숫자 또는 나가기를 입력하세요");
            }
        }


    }
}
