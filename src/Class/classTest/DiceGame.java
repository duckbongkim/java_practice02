package Class.classTest;

public class DiceGame {
    int userDice;
    int comDice;

    public DiceGame(int userDice){
        this.userDice = userDice;

        int[] option = {1,2,3,4,5,6};
        int rand = (int) (Math.random()*option.length);
        this.comDice = option[rand];
    }

    public String getResult(){
        if (userDice == comDice){
            return "비김";
        } else if (userDice > comDice) {
            return "이김";
        } else {
            return "짐";
        }
    }

    public void printResult(){
        System.out.println("유저: "+userDice+", 컴퓨터: "+comDice+", 결과: "+getResult());
    }
}
