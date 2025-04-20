package Class.classTest;

import java.util.Random;

public class UpDownGame {
    int comNum;

    public UpDownGame(){

        Random random = new Random();
        this.comNum = random.nextInt(100)+1;
    }

    public String getResult(int userNum){
        if(userNum > comNum){
            return "Down";
        } else if (userNum < comNum) {
            return "UP";
        } else {
            return "정답!";
        }
    }


}
