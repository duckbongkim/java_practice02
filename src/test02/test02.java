package test02;

public class test02 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,7,55};
        findMax(arr);
    }


    public static void findMax(int[] numbers){
        int max =numbers[0];
        for(int i =0; i< numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("가장큰수"+ max);
    }
}
