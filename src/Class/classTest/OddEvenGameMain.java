package Class.classTest;

import java.util.Scanner;

public class OddEvenGameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("홀 or 짝 입력: ");
        String input = scanner.next();

        OddEvenGame game = new OddEvenGame(input);
        System.out.println("컴퓨터 숫자: "+game.comNum);
        System.out.println("결과: "+ game.getResult());
    }
}
