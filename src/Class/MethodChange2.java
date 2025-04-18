package Class;

public class MethodChange2 {
    public static void main(String[] args) {
        Data01 dataA = new Data01();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = "+dataA.value);
        changeReference(dataA);
        System.out.println("호출 후:"+dataA.value);
    }

    static void changeReference(Data01 dataX){
        dataX.value = 20;
    }
}
