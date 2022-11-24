package transport;

import java.time.LocalDate;
import java.util.Objects;

public class Train extends Transport {
    private int priceOfTrip;
    private double travelTime;
    private String dameDepartureStation;
    private String finalStop;
    private int numberOfWagons;


    public Train(String brand, String model, int year, String country, int priceOfTrip, double travelTime, String dameDepartureStation, String finalStop, int numberOfWagons) {
        super(brand, model, year, country);
        setPriceOfTrip(priceOfTrip);
        setTravelTime(travelTime);
        setDameDepartureStation(dameDepartureStation);
        setFinalStop(finalStop);
        setNumberOfWagons(numberOfWagons);
    }

    public int getPriceOfTrip() {
        return priceOfTrip;
    }

    public void setPriceOfTrip(int priceOfTrip) {
        if (priceOfTrip <= 0) {
            this.priceOfTrip = Math.abs(priceOfTrip);
        }
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        if (travelTime <= 0) {
            this.travelTime = Math.abs(travelTime);
        } else {
            this.travelTime = 1;
        }
    }

    public String getDameDepartureStation() {
        return dameDepartureStation;
    }

    public void setDameDepartureStation(String dameDepartureStation) {
        this.dameDepartureStation = dameDepartureStation;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        if (finalStop != null && !finalStop.isEmpty() && !finalStop.isBlank()) {
            this.finalStop = finalStop;
        }
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons < 0) {
            this.numberOfWagons = Math.abs(numberOfWagons);
        } else {
            this.numberOfWagons = numberOfWagons;
        }
    }

    public String printTrain() {
        return "Поезд " + getBrand() + " " + getModel() + ", состоящий из " +
                getNumberOfWagons() + " вагонов, проследует от станции " +
                getDameDepartureStation() + " до станции " + getFinalStop() + ". В пути поезд может развить " +
                "скорость до " + getMaxSpeed() + " км/ч.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return priceOfTrip == train.priceOfTrip && Double.compare(train.travelTime, travelTime) == 0 && numberOfWagons == train.numberOfWagons && Objects.equals(dameDepartureStation, train.dameDepartureStation) && Objects.equals(finalStop, train.finalStop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceOfTrip, travelTime, dameDepartureStation, finalStop, numberOfWagons);
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
