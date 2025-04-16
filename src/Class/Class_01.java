package Class;

class Car {
    String kind;
    String color;
    int year;

    void run(){
        System.out.println("car is running");
    }

    void speedUp(){
        System.out.println("car is speeding up");
    }
}


public class Class_01 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.kind = "Sonata";
        myCar.color = "blue";
        myCar.year = 2020;

        Car yourCar = new Car();
        yourCar.kind = "pride";
        yourCar.color = "red";
        yourCar.year = 2024;

        myCar.run();
        yourCar.run();

        myCar.speedUp();
        yourCar.speedUp();

    }
}
