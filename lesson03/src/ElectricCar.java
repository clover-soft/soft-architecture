// Принцип подстановки Барбары Лисков
// Класс ElectricCar является подтипом класса Car и может использоваться везде,
// где ожидается объект типа Car, не нарушая поведение программы
public class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar(String brand, String model, int year, double batteryCapacity) {
        super(brand, model, year);
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }
}