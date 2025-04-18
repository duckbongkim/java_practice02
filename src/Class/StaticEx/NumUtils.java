package Class.StaticEx;

public class NumUtils {
    private NumUtils(){}

    public static boolean isEven(int number){
        if(number % 2==0){
            return true;
        }
        return false;
    }

    public static boolean isOdd(int number){
        if(number % 2 != 0){
            return true;
        }
        return false;
    }

    public static int max(int a, int b){
        if(a > b){
            return a;
        }
        return b;
    }
    public static int min(int a, int b){
        if(a<b){
            return a;
        }
        return b;
    }
}
