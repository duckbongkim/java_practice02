package Class.StaticEx;

import java.util.Scanner;

public class AgeCalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("출생 연도를 입력하세요: ");
        int birthYear = scanner.nextInt();

        int age = AgeCalculator.calculateAge(birthYear);  // 나이 계산
        String isAdult = AgeCalculator.isAdult(age);     // 성인 여부 판단

        System.out.println("출생 연도: " + birthYear);
        System.out.println("현재 나이: " + age + "살");
        System.out.println("성인 여부: " + isAdult);
    }
}
