package Class.classTest;

public class RpsGame {
    String userChoice;
    String comChoice;

    public RpsGame(String userChoice){
        this.userChoice = userChoice;

        String[] option = {"가위","바위","보"};
        int rand = (int) (Math.random()*3);
        this.comChoice = option[rand];
    }

    public String getResult(){
        if(userChoice.equals(comChoice)){
            return "비김";
        } else if (
                (userChoice.equals("가위") && comChoice.equals("보")) ||
                        (userChoice.equals("바위")&&comChoice.equals("가위"))||
                        (userChoice.equals("보")&&comChoice.equals("바위"))
        ) {
            return "이김";
        } else {
            return "짐";
        }
    }

    public void printResult(){
        System.out.println("유저: "+userChoice + ", 컴퓨터: "+comChoice+", 결과: "+getResult());
    }
}
