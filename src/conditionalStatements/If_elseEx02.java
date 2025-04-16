package conditionalStatements;

public class If_elseEx02 {
    public static void main(String[] args) {
        int dollar = 1;

        if(dollar < 1){
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int won = dollar * 1300;
            System.out.println(won + "원 입니다.");
        }
    }
}
