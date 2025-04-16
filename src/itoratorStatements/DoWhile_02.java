package itoratorStatements;

public class DoWhile_02 {
    public static void main(String[] args) {
        int a =1;
        while(a<=10){
            if(a==5)
                break;
            System.out.println("a:"+a);
            a++;
        }
    }
}
