package Class.StaticEx;

import java.util.Scanner;

public class NumUtilsMain {
    public static void main(String[] args) {
        int num1= 9;
        int num2= 8;

        System.out.println("짝수임?: "+NumUtils.isEven(num1));
        System.out.println("홀수입?: "+NumUtils.isOdd(num2));
        System.out.println(num1+"과"+num2+"중 더 큰수는: "+NumUtils.max(num1,num2));
        System.out.println(num1+"과"+num2+"중 더 작은수는: "+NumUtils.min(num1,num2));

    }
}
