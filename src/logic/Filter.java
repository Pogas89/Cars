package logic;

import domain.Car;

/**
 * @author Dmitry Ivanov
 * Implements method isSatisfy
 */
public interface Filter {
    /**
     * @param car Car we need to check
     * @return boolean value of whether the car meets the necessary parameters
     */
    boolean isSatisfy(Car car);
}
