package Class.classTest02;

import java.util.Scanner;

public class FoundTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = {2,4,5,11};

        System.out.println("target 값을 입력하세요: ");
        int target = scanner.nextInt();

        boolean found = false;

        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        if(found){
            System.out.println("Yse");
        } else{
            System.out.println("No");
        }

    }
}
