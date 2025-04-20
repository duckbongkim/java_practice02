package Class.classTest02;

public class FoundNum03 {
    public static void main(String[] args) {

        int[] nums = {3, -2, 5, 0, -4, 1};
        int sum = 0;
        int product = 1;

        for (int i=0; i< nums.length; i++){
            if(nums[i] >=0){
                sum += nums[i];
            } else {
                product *= nums[i];
            }
        }
        System.out.println("양수들의 합: "+sum);
        System.out.println("음수들의 합: "+product);
    }
}

