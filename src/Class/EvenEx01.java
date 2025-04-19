package Class;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EvenEx01 {
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,5,6,7,8,8};

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < number.length; i++){
            if(number[i] % 2 ==0){
                list.add(number[i]);
            }
        }
        for(int i =0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
