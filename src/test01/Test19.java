package test01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("아이디 입력(영문소문자+숫자 조합으로 5~12자 로 작성) : ");
            String id = scanner.next();

            System.out.print("비밀번호 입력(영문대소문자+숫자 조합으로 8자 이상 ):");
            String password = scanner.next();

            System.out.print("이메일을 입력하세요: ");
            String email = scanner.next();


            if(!id.equals("")){
                if(id.matches("[a-z0-9]{5,12}")){
                    System.out.println("아이디: "+id);
                } else {
                    System.out.println("아이디 형식이 부적합합니다.");
                    break;
                }
            } else {
                System.out.println("아이디를 입력하세요.");
                break;
            }

            if(!password.equals("")){
                if (password.matches("[a-zA-Z0-9]{8,}")){
                    System.out.println("비밀번호: "+password);
                } else {
                    System.out.println("비밀번호 형식이 부적합니다.");
                    break;
                }
            } else {
                System.out.println("비밀번호를 입력하세요");
                break;
            }

            if(!email.equals("")){
                if (email.contains("@")&&email.contains(".")){
                    System.out.println("이메일: "+email);
                } else {
                    System.out.println("이메일 형식이 부적합합니다.");
                    break;
                }
            }else {
                System.out.println("이메일을 입력하세요: ");
                break;
            }
            System.out.println("회원가입 완료!");
            break;
        }
    }
}
