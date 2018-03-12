package domain;

/**
 * @author Dmitry Ivanov
 * Class of Car not older than three years
 * @see domain.Car Abstract class for this class
 */
public class AlmostNewCar extends Car {
    /**
     * @param model Model of car
     * @param priceOfNew Price of new car
     * @param year Year of issue
     * @param consumption Gasoline consumption per 100 km
     * @param speed Maximum speed value
     */
    public AlmostNewCar(String model, int priceOfNew, int year, double consumption, int speed) {
        super(model, priceOfNew, year, consumption, speed);
    }

    /**
     * Method to get today price of car
     * @return double value of today price
     */
    @Override
    public double getTodayPrice() {
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        calendar.setTime(new java.util.Date());
        int currentYear = calendar.get(java.util.Calendar.YEAR);
        double currentPrice=priceOfNew;
        for (int i = 0; i <=(currentYear-year) ; i++) {
            currentPrice-=currentPrice*0.05;
        }
        return currentPrice;
    }
}
