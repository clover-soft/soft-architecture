// Принцип открытости/закрытости
// Для добавления нового функционала (например, расчета расхода топлива)
// мы расширяем класс Car, а не изменяем его
public class CarWithFuelConsumption extends Car {
    private double fuelConsumption;

    public CarWithFuelConsumption(String brand, String model, int year, double fuelConsumption) {
        super(brand, model, year);
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}

