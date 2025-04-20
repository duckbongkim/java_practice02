package Class.classTest02;

import java.util.Random;

public class EvenOddBattleGame {
    String userChoice;
    String comChoice;

    public EvenOddBattleGame(String userChoice){
        this.userChoice = userChoice;

        Random random = new Random();
        int com = random.nextInt(2);

        if(com == 0){
            this.comChoice = "홀수";
        } else {
            this.comChoice = "짝수";
        }

    }

    public String getResult(){
        if(userChoice.equals(comChoice)){
            return "유저 승";
        } else {
            return "컴퓨터 승";
        }
    }

    public void printResult(){
        System.out.println("유저선택: "+userChoice);
        System.out.println("컴퓨터 선택: "+comChoice);
        System.out.println("결과: "+getResult());
    }


}
