package Class.classTest;

public class OddEvenGame {
    int comNum;
    String userGuss;

    public OddEvenGame(String userNum){
        this.userGuss = userNum;

        int rand = (int)(Math.random()*100)+1;
        this.comNum = rand;
    }

    public String getResult() {
        String corrent = (comNum % 2==0 ? "짝" : "홀");
        if(userGuss.equals(corrent)){
            return "정답입니다.";
        } else {
            return "틀렸습니다.";
        }
    }
}
