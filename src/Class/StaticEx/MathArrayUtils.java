package Class.StaticEx;

public class MathArrayUtils {

    private MathArrayUtils(){}

    public static int sum(int[] arrays){
        int total =0;
        for(int array : arrays){
            total += array;
        }
        return total;
    }

    public static double average(int[] arrays){
        return (double) sum(arrays) / arrays.length;
    }

    public static int min(int[] arrays){
        int minNum = arrays[0];
        for(int array:arrays){
            if(array < minNum){
                minNum = array;
            }
        }
        return minNum;
    }

    public static int max(int[] arrays){
        int maxNum = arrays[0];
        for(int array:arrays){
            if(array > maxNum){
                maxNum = array;
            }
        }
        return maxNum;
    }
}
