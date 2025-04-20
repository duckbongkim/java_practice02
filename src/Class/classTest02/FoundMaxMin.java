package Class.classTest02;

public class FoundMaxMin {
    public static void main(String[] args) {
        int nums[] = {2,5,9,20,3,10};
        int max = nums[0];
        int min = nums[0];

        for(int i =0; i < nums.length; i++){
            if(max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i] ){
                min = nums[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
