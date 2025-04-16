package test01;

import java.util.Scanner;

public class Test20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] options = {"가위", "바위", "보"};
        System.out.println("가위바위보 게임(exit 입력시 종료)");
        
        while(true) {
            String com = options[(int) (Math.random() * 3)];
            System.out.print("유저 입력: ");
            String user = scanner.next();
            if(user.equals("exit")){
                System.out.println("게임종료");
                break;
            }

            if(user.equals(com)){
                System.out.println("비겻습니다.");
            } else if (
                    (user.equals("가위") && com.equals("보")) || (user.equals("보")&&com.equals("바위")) || (user.equals("바위")&&com.equals("가위"))
            ) {
                System.out.println("이김");
            }else {
                System.out.println("짐");
            }
        }
    }
}
