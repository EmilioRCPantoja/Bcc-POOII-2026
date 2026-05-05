package car.classes;

import car.interfaces.Car;

public class Sedan implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Sedan car.");
    }
}