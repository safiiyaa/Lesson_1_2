import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, FuelType.GASOLINE, 60, 34, false);
        System.out.println(car.getInfo());
        car.startEngine();
        car.drive(180);
        System.out.println("Fuel level: " + car.getFulLevel());
        car.stopEngine();

        System.out.println("----------");

        Car car1 = new Car("Mercedes-Bends", "Sprinter", 2009, FuelType.DIESEL, 80, 53, false);
        System.out.println(car1.getInfo());
        car1.startEngine();
        car1.drive(230);
        System.out.println("Fuel level: " + car1.getFulLevel());
        car1.stopEngine();

        System.out.println("----------");

        ElectricCar car2 = new ElectricCar("Tesla", "Model 3", 2022, FuelType.ELECTRICITY, 75, 28, false);
        System.out.println(car2.getInfo());
        car2.startEngine();
        car2.drive(300);
        System.out.println("Fuel level: " + car2.getFulLevel());
        car2.stopEngine();
    }
}