package Class.classTest02;

import java.util.ArrayList;
import java.util.Scanner;

public class OddEvenGameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("숫자 5개를 입력하세요:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 짝수만 ArrayList에 저장
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (OddEvenGame.isEven(numbers[i])) {
                evenNumbers.add(numbers[i]);
            }
        }

        // 짝수 출력
        System.out.print("입력한 짝수들: ");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }

        // 최대값 구해서 출력
        int max = OddEvenGame.getMax(numbers);
        System.out.println("\n가장 큰 수: " + max);
    }
}
