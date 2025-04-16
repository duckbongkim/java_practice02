package itoratorStatements;

public class While_02 {
    public static void main(String[] args) {
        int row, col;
        row = 1;
        while(row<=10){
            col=1;
            while(col<=10){
                System.out.println(row+col+".");
                col++;
            }
            row++;
            System.out.println();
        }
    }
}
