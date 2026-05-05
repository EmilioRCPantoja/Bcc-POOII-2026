package client;

import factory.ConcreteVehicleFactory;
import factory.VehicleFactory;
import interfaces.IFactory;

public class Client {

    public static void main(String[] args) {
        VehicleFactory factory = new ConcreteVehicleFactory();

        IFactory scooter = factory.GetVehicle("Scooter");
        scooter.Drive(10);

        IFactory bike = factory.GetVehicle("Bike");
        bike.Drive(20);
    }
}
