package Class.classTest02;

public class OddEvenGame {
    private OddEvenGame(){};

    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        return false;
    }
    public static boolean isOdd(int number){
        if(number%3==0){
            return true;
        }
        return false;
    }

    public static int getMax(int[] numbers){
        int max = numbers[0];
        for(int i = 1; i<numbers.length; i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        return max;
    }
}
