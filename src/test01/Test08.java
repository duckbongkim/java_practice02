package test01;

public class Test08 {
    public static void main(String[] args) {
        int [] scores = {75,90,80,60,100,95};
        int max = scores[0];
        for(int i =1; i<scores.length; i++){
            if(scores[i]>max){
                max = scores[i];
            }
        }
        System.out.println(max);
    }
}
