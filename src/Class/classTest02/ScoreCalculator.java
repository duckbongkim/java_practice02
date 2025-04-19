package Class.classTest02;

public class ScoreCalculator {
    private ScoreCalculator(){};

    public static String getGrade(int score){
        if(score>=90){
            return "A";
        } else if (score>=80) {
            return "B";
        } else if (score>=70) {
            return "C";
        } else if(score>=60) {
            return "D";
        } else {
            return "F";
        }

    }

    public static boolean isPass(int score){
        if(score>=60){
            return true;
        }
        return false;
    }
}
