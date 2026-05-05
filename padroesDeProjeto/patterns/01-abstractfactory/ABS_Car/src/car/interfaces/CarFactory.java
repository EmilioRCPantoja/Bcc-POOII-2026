package car.interfaces;

// https://www.geeksforgeeks.org/abstract-factory-pattern/

public interface CarFactory {
    Car createCar();
    CarSpecification createSpecification();
}

