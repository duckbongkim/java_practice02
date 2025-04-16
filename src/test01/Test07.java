package test01;

public class Test07 {
    public static void main(String[] args) {
        int [] num = {90,85,70,100,65};
        int sum = 0;
        for(int i =0; i<num.length; i++){
            sum+=num[i];
        }
        System.out.println(sum);
        double average = (double) sum / num.length;
        System.out.println(average);
    }
}
