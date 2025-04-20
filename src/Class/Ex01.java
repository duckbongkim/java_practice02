package Class;

import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 8, 7, 4};
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();




        for(int i=0; i< nums.length; i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            } else{
                odd.add(nums[i]);
            }
        }
        System.out.println("짝수 리스트: "+even);
        System.out.println("홀수 리스트: "+odd);

        int evenMax = Integer.MIN_VALUE;
        int oddMax = Integer.MIN_VALUE;

        for(int num : even){
            if(num>evenMax){
                evenMax = num;
            }
        }

        for(int num: odd){
            if(num>oddMax){
                oddMax=num;
            }
        }
        System.out.println("짝수 최대값: "+evenMax);
        System.out.println("홀수 최대값: "+oddMax);
    }
}
