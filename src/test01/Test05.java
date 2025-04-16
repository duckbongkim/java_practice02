package test01;

public class Test05 {
    public static void main(String[] args) {
        String str = "apple and banana";
        int count = 0;
        for(int i = str.length()-1; i>=0; i--){
            if (str.charAt(i)=='a'){
                count++;
            }

        }
        System.out.println(count);
    }
}
