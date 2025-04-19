package Class.classTest02;

import java.util.Scanner;

public class ScroeCalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("성적을 입력하세요: ");
        int score = scanner.nextInt();
        System.out.println("입력한 성적: "+score+"학점: "+ScoreCalculator.getGrade(score));
        System.out.println("60점 이상: "+ScoreCalculator.isPass(score));
    }
}
