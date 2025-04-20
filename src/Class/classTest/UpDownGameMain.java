package Class.classTest;

import java.util.Scanner;

public class UpDownGameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UpDownGame game = new UpDownGame();
        System.out.println("숫자 업다운 게임 시작!(1~100)");

        while (true){
            System.out.print("숫자 입력: ");
            int userNum = scanner.nextInt();

            String result = game.getResult(userNum);
            System.out.println(result);

            if(result.equals("정답!")){
                System.out.println("게임 종료!");
                break;
            }
        }
    }
}
