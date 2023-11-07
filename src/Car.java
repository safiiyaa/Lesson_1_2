import java.util.Random;

public class Car {
    private String make;
    private String model;
    private int year;
    private FuelType fuelType;
    private int fuelCapacity;
    private int fulLevel;
    private boolean isEngineRunning;

    public Car(String make, String model, int year, FuelType fuelType, int fuelCapacity, int fulLevel, boolean isEngineRunning) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.fulLevel = fulLevel;
        this.isEngineRunning = isEngineRunning;
    }

    public FuelType getFuelType() {
        return fuelType;
    }
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
    public boolean isEngineRunning() {
        return isEngineRunning;
    }
    public void setEngineRunning(boolean engineRunning) {
        isEngineRunning = engineRunning;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getFuelCapacity() {
        return fuelCapacity;
    }
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    public int getFulLevel() {
        return fulLevel;
    }
    public void setFulLevel(int fulLevel) {
        this.fulLevel = fulLevel;
    }

    public void startEngine() {
        System.out.println("Запущен двигатель автомобиля " + make + " " + model + "!");
        setEngineRunning(true);
    }
    public void stopEngine() {
        System.out.println("Двигатель автомобиля " + make + " " + model + " остановлен!");
        setEngineRunning(false);
    }
    public void fillFuelTank(){
        setFulLevel(getFulLevel() + 50);
    }
    public void drive(int drive) {
        if (isEngineRunning = true && (drive / 10) <= getFulLevel()) {
            System.out.println("Автомобиль " + make + " " + model + " проехал " + drive + " км.");
            int consumption = drive;
            setFulLevel(getFulLevel() - (consumption / 10));
        }else {
            System.out.println("Двигатель автомобиля " + make + " " + model + " выключен или недостаточно топлива!");
        }
    }
    public String getInfo(){
        return "Mare and model: " + getMake() + " " + getModel() +
                "\nYear of issue: " + getYear() +
                "\nFuel type: " + getFuelType() +
                "\nFuel capacity: " + getFuelCapacity() +
                "\nFuel level: " + getFulLevel();
    }
}