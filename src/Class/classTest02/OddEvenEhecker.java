package Class.classTest02;

public class OddEvenEhecker {
    int number;
    String result;

    public OddEvenEhecker(int number){
        this.number = number;

        if(number % 2==0){
            this.result = "짝수";
        } else{
            this.result = "홀수";
        }
    }

    public void printResult(){
        System.out.println("입력한 숫자: "+number+", 결과: "+result);
    }


}
