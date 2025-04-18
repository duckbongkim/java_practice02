package Class.classTest;

import java.util.Scanner;

public class PasswordExMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("비밀번호 입력: ");
        String input = scanner.next();

        PasswordEx password = new PasswordEx(input);
        password.printResult();
    }
}
