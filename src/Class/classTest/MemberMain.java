package Class.classTest;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Member[] members = new Member[2];
        
        for(int i =0; i< members.length; i++){
            System.out.println((i+1)+" 번째 회원 정보 입력");

            System.out.print("이름: ");
            String name = scanner.next();

            System.out.print("나이: ");
            int age = scanner.nextInt();

            System.out.print("이메일: ");
            String email = scanner.next();

            members[i] = new Member(name, age, email);
            System.out.println();
        }

        System.out.println("전체 회원 정보: ");
        for (Member m : members){
            m.printInfo();
        }
    }
}
