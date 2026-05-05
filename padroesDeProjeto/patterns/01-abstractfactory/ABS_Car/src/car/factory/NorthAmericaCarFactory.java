package car.factory;

import car.classes.NorthAmericaSpecification;
import car.classes.Sedan;
import car.interfaces.Car;
import car.interfaces.CarFactory;
import car.interfaces.CarSpecification;

public class NorthAmericaCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createSpecification() {
        return new NorthAmericaSpecification();
    }
}
