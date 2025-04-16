package test01;

public class Test16 {
    public static void main(String[] args) {
        String[] names = {"민수짱", "지민", "정국", "남준", "석진", "호석", "태형", "슈가"};
        String longest = names[0];
        for(int i = 1; i< names.length; i++){
            if(names[i].length()>longest.length()){
                longest = names[i];
            }
        }
        System.out.println("가장긴 이름: "+longest);

    }
}
