package test02;

public class test01 {
    public static void main(String[] args) {
        int[] arr = {10,14,5,20,55,66,70};
        countEven(arr);
    }

    public static void countEven(int[] number){
        int count=0;
        for (int i = 0; i< number.length; i++){
            if(number[i] % 2==0){
                count++;
            }
        }
        System.out.println("짝수의 수: "+count);
    }
}
