package itoratorStatements;

public class Nested2 {
    public static void main(String[] args) {
        for(int i=2; i<=9; i++){
            System.out.println(i+"단");
            for(int j=1; j<=9; j++){
                int cal = i*j;
                System.out.println(i+"x"+j+"="+cal);
            }
            System.out.println();
        }
    }
}
