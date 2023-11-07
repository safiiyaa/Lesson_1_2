public class ElectricCar extends Car{
    private int  batteryCapacity;

    public ElectricCar(String make, String model, int year, FuelType fuelType, int batteryCapacity, int fulLevel, boolean isEngineRunning) {
        super(make, model, year, fuelType, batteryCapacity, fulLevel, isEngineRunning);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public String getInfo() {
        return "Mare and model: " + getMake() + " " + getModel() +
                "\nYear of issue: " + getYear() +
                "\nFuel type: " + getFuelType() +
                "\nFuel capacity: " + getBatteryCapacity() +
                "\nFuel level: " + getFulLevel();
    }
}