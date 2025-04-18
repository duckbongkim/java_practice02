package Class.StaticEx;

public class TemperatureConverter {
    private TemperatureConverter(){};

    public static double toFahrenheit(double celsius){
        double result=0;
        result = (celsius * 9/5)+32;
        return result;
    }

    public static double toCelsius(double fahrenheit){
        double result = 0;
        result = (fahrenheit - 32)*5/9;
        return result;
    }
}
