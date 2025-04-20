package Class.classTest02;

public class FoundMaxMin02 {
    public static void main(String[] args) {
        int[] nums = {5,4,2,1,20,30};
        int max = nums[0];
        int min = nums[0];
        int minusNum = 0;
        for(int i = 0; i< nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
            if(min > nums[i]){
                min = nums[i];
            }
        }
        minusNum = max - min;

        System.out.println("큰수-작은수: "+minusNum);
    }

}
