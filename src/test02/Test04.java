package test02;

public class Test04 {
    public static void main(String[] args) {
        message("hello, world",3);
        message("hello, world",5);
        message("hello, world",6);
    }

    public static void message(String message, int times){
        for(int i=0; i<=times; i++){
            System.out.println(message);
        }
    }
}
