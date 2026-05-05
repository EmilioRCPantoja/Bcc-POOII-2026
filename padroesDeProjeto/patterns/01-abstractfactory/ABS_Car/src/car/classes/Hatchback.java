package car.classes;

import car.interfaces.Car;

public class Hatchback implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Hatchback car.");
    }
}
