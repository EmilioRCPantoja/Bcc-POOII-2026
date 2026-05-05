package car.factory;

import car.classes.EuropeSpecification;
import car.classes.Hatchback;
import car.interfaces.Car;
import car.interfaces.CarFactory;
import car.interfaces.CarSpecification;

public class EuropeCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Hatchback();
    }
 
    @Override
    public CarSpecification createSpecification() {
        return new EuropeSpecification();
    }
}
 