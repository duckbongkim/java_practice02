package method;

public class Method_05 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }
    
    public static void checkAge(int age){
        if(age<18){
            System.out.println(age+"살 입장불가");
            return;
        }
        System.out.println(age+"살 입장하세요");
    }
}
