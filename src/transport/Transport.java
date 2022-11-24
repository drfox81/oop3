package transport;

public abstract class Transport {
    private String brand;
    private String model;
    private int year;
    private String country;
    private String color;
    private int maxSpeed;
    private String fuel;

    public Transport(String brand, String model, int year, String country) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getFuel() {
        if (fuel != null && fuel.isBlank() && fuel.isEmpty()) {
            return fuel.toLowerCase();
        }
        return fuel;
    }

    public void setFuel(String fuel) {
        if (this.fuel == null || this.fuel.isEmpty() || this.fuel.isBlank()) {

            if (fuel == "дизель") {
                this.fuel = fuel;
            } else if (fuel == "бензин") {
                this.fuel = fuel;
            } else if (fuel == "электричество") {
                this.fuel = fuel;
            }
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    //public abstract void refill(int quantity);
    public final void refill(int quantity) {
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

    public abstract void refillTwo(int q);

    public void setColor(String color) {
        if (color != null && !color.isEmpty()) {
            this.color = color;
        } else {
            this.color = "белый";
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed != 0) {
            this.maxSpeed = maxSpeed;
        }
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

}
