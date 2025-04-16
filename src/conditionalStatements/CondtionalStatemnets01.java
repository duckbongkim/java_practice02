package conditionalStatements;

public class CondtionalStatemnets01 {
    public static void main(String[] args) {
        int score = 90;
        if(score >=90){
            System.out.println("Excellent");
        } else if (score >=80) {
            System.out.println("Good");
        } else if (score>=70) {
            System.out.println("Average");
        } else if (score>=60) {
            System.out.println("Poor");
        } else {
            System.out.println("Fail");
        }
    }
}
