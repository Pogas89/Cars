package domain;

import java.util.ArrayList;

/**
 * @author Dmitry Ivanov
 * Class of Garage with it's name and list of cars
 */
public class Garage {
    private String name;
    private ArrayList<Car> garage = new ArrayList<>();

    public Garage() {
    }

    public Garage(String name) {
        this.name=name;
    }

    /**
     * @param name Name of garage
     * @param cars ArrayList of cars
     */
    public Garage(String name ,ArrayList<Car> cars){
        this.name=name;
        garage=cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCar(Car ob){
        garage.add(ob);
    }

    public Car  getCar(int index){
        return garage.get(index);
    }

    public Boolean removeCar(Car ob){
        return garage.remove(ob);
    }

    /**
     * Method designed to get the cost of all cars in garage
     * @return Price of all cars in garage
     */
    public double getGarageCost(){
        double cost=0;
        for (Car c: garage) {
            cost+=c.getTodayPrice();
        }
        return cost;
    }

    public ArrayList<Car> getGarage() {
        return garage;
    }

    @Override
    public String toString() {
        String str=name+":\n";
        int i=1;
        for (Car c:garage) {
            str+=i+". "+c.toString()+"\n";
            i++;
        }
        str+="Current garage cost is "+getGarageCost()+"$\n";

        return str;
    }
}
