package Class.StaticEx;

import java.util.Scanner;

public class TemperatureConverterMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("섭씨 온도를 입력하세요: ");
        double celsius = scanner.nextDouble();
        System.out.print("화씨 온도를 입력하세요: ");
        double fahrenheit = scanner.nextDouble();

        System.out.println("입력한 섭씨 온도: "+celsius+"℃");
        System.out.println("화씨로 변환: "+TemperatureConverter.toFahrenheit(celsius));

        System.out.println("입력한 화씨 온도: "+fahrenheit+"f");
        System.out.println("섭씨로 변환: "+TemperatureConverter.toCelsius(fahrenheit));

    }
}
