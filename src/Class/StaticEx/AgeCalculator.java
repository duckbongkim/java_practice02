package Class.StaticEx;

public class AgeCalculator {
    private AgeCalculator(){};


    public static int calculateAge(int birthYear){
        int result = 0;
        result = 2025-birthYear+1;
        return result;
    }

    public static String isAdult(int age){
        return (age>=20) ? "성인":"미성년";
    }
}
