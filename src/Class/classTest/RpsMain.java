package Class.classTest;

import java.util.Scanner;

public class RpsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위바위보 게임(나가기 입력시 종료)");

        while (true){
            System.out.print("유저입력: ");
            String user = scanner.next();

            if(user.equals("나가기")){
                System.out.println("게임종료");
                break;
            }

            RpsGame game = new RpsGame(user);
            game.printResult();
        }
    }
}
