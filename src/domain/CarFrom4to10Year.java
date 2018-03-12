package domain;

/**
 * @author Dmitry Ivanov
 * Class of Car from three to ten years
 * @see domain.Car Abstract class for this class
 */
public class CarFrom4to10Year extends Car {
    /**
     * @param model Model of car
     * @param priceOfNew Price of new car
     * @param year Year of issue
     * @param consumption Gasoline consumption per 100 km
     * @param speed Maximum speed value
     */
    public CarFrom4to10Year(String model, int priceOfNew, int year, double consumption, int speed) {
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
            currentPrice-=currentPrice*0.045;
        }
        return currentPrice;
    }
}
