package test;
import domain.*;
import logic.ConsumptionFilter;
import logic.Filter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Garage garage1 = new Garage("MyGarage");
        Car car1 = new AlmostNewCar("Mazda",20000,2016, 12.0, 180);
        garage1.addCar(car1);
        Car car2 = new CarMore10Years("Honda",21000,2007, 11.2, 190);
        garage1.addCar(car2);
        Car car3 = new CarFrom4to10Year("Toyota",26000,2009, 10.3, 200);
        garage1.addCar(car3);
        System.out.println(garage1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower value of consumption");
        double minConsumption = scanner.nextDouble();
        System.out.println("Enter the upper value of consumption");
        double maxConsumption = scanner.nextDouble();
        scanner.close();

        Filter filter = new ConsumptionFilter(minConsumption,maxConsumption);

        ArrayList<Car> cars = garage1.getGarage();
        for (Car car : cars){
            if (filter.isSatisfy(car))
                System.out.println(car.getModel());
        }
        System.out.println("-------------------------------");
        System.out.println("Cars ordered by Speed ");

        Collections.sort(cars);

        for (Car car: cars){
            System.out.println(car.getModel()+ " - " + car.getSpeed());
        }
    }
}
