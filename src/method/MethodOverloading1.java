package method;

public class MethodOverloading1 {
    public static void main(String[] args) {
        System.out.println("1:"+add(1,2));
        System.out.println("2:"+add(1,2,3));
    }

    public static int add(int x, int y){
        System.out.println("1 호출");
        return x+y;
    }

    public static int add(int a, int b, int c){
        System.out.println("2 호출");
        return a+b+c;
    }
}
