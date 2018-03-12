package logic;

import domain.Car;

/**
 * @author Dmitry Ivanov
 * The class is designed to find out if the car is satisfying our
 * cosumption parametrs
 * @see logic.Filter
 */
public class ConsumptionFilter implements Filter {
    private double minConsuption;
    private double maxConsuption;

    /**
     * @param minConsuption min consumption value
     * @param maxConsuption max consumption value
     */
    public ConsumptionFilter(double minConsuption, double maxConsuption){
        if (minConsuption>maxConsuption && minConsuption<=0)
            throw new RuntimeException("Error in args");
        this.minConsuption = minConsuption;
        this.maxConsuption = maxConsuption;
    }

    @Override
    public boolean isSatisfy(Car car) {
        double consuption = car.getConsumption();
        return minConsuption <= consuption && maxConsuption>= consuption ;
    }
}
