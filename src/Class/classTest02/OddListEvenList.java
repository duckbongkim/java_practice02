package Class.classTest02;

import java.util.ArrayList;

public class OddListEvenList {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7,8,99,200};
        ArrayList<Integer> Odd = new ArrayList<>();
        ArrayList<Integer> Even = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2==0){
                Even.add(nums[i]);
            } else {
                Odd.add(nums[i]);
            }
        }
        System.out.println("짝수: "+Even);
        System.out.println("홀수: "+Odd);

    }
}
