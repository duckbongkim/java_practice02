package method;

import java.util.Scanner;

public class Method_04 {
    static int add(int x, int y){
        int result;
        result = x+y;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = add(a,b);

        System.out.println(a+"+"+b+"="+c);
        scanner.close();
    }
}
