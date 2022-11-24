package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int year, String country) {
        super(brand, model, year, country);
    }

    public String printBus() {
        return "Автобус " + getBrand() + " " + getModel() + ", " + getYear() + " года, производство - " +
                getCountry() + ", цвет - " + getColor();
    }

    @Override
    public void refillTwo(int quantity) {
        if (getFuel() == "дизель") {
            System.out.println("Зправляем дизелем " + quantity + " литров");
        } else if (getFuel() == "бензин") {
            System.out.println("Зправляем бензином " + quantity + " литров");
        } else if (getFuel() == "электричество") {
            System.out.println("Заряжаем на " + quantity + " рублей");
        } else {
            System.out.println("Определите тип топлива для начала");
        }
    }
}
