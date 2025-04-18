package Class.StaticEx;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("소나타");
        Car car2 = new Car("지바겐");
        Car car3 = new Car("아반떼");


        Car.showTotalCars();
    }
}
