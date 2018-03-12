package domain;

/**
 * @author Dmitry Ivanov
 * Abstract Car class
 */
public abstract class Car implements Comparable<Car> {
    protected String model;
    protected double priceOfNew;
    protected int year;
    protected double consumption;
    protected int speed;

    /**
     * @param model Model of car
     * @param priceOfNew Price of new car
     * @param year Year of issue
     * @param consumption Gasoline consumption per 100 km
     * @param speed Maximum speed value
     */
    public Car(String model, int priceOfNew, int year, double consumption, int speed) {
        this.model = model;
        this.priceOfNew = priceOfNew;
        this.year = year;
        this.consumption = consumption;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPriceOfNew() {
        return priceOfNew;
    }

    public void setPriceOfNew(double priceOfNew) {
        this.priceOfNew = priceOfNew;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Abstract method to get today price of car
     * @return double value of today price
     */
    public abstract double getTodayPrice();

    @Override
    public String toString() {
        return "Car " +
                "model='" + model + '\'' +
                ", priceOfNew=" + priceOfNew +
                ", year=" + year +
                ", currentCost=" + getTodayPrice() +
                ", consumption=" + getConsumption() +
                ", speed=" + getSpeed();
    }

    @Override
    public int compareTo(Car car) {
        if(car == null) throw new NullPointerException("car is NULL");
        return Double.valueOf(consumption).compareTo(car.getConsumption());
    }
}
