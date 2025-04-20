package Class.classTest02;

import java.util.Random;

public class EvenOddGame {
    String userChoice;  // "짝수" 또는 "홀수"
    int userNum;        // 유저가 입력한 숫자
    int comNum;         // 컴퓨터가 랜덤으로 고른 숫자

    public EvenOddGame(String userChoice, int userNum) {
        this.userChoice = userChoice;
        this.userNum = userNum;
        Random random = new Random();
        this.comNum = random.nextInt(10); // 0~9 랜덤 숫자
    }

    public String getResult() {
        int sum = userNum + comNum;
        String resultParity = (sum % 2 == 0) ? "짝수" : "홀수";

        if (userChoice.equals(resultParity)) {
            return "이김";
        } else {
            return "짐";
        }
    }

    public void printResult() {
        int sum = userNum + comNum;
        String resultParity = (sum % 2 == 0) ? "짝수" : "홀수";

        System.out.println("유저 숫자: " + userNum);
        System.out.println("컴퓨터 숫자: " + comNum);
        System.out.println("합: " + sum + " → " + resultParity);
        System.out.println("결과: " + getResult());
    }
}
