package conditionalStatements;

public class CondtionalStatments02 {
    public static void main(String[] args) {
        int a=10, b=10;
        if(a>=b){
            if(a>b){
                System.out.println("a가 b보다 큰 수입니다.");
            } else {
                System.out.println("a와 b는 같은 수입니다.");
            }
        }else {
            System.out.println("a가 b보다 작은 수입니다.");
        }

    }
}
