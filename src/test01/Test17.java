package test01;

public class Test17 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 9, 20, 33, 42, 55, 64};
        for(int i = 0; i<numbers.length; i++){
            if (numbers[i]%2==0) {
                System.out.println("짝수: "+numbers[i]);
            }
        }
    }
}
