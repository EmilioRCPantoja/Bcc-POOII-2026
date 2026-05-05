package factory;

import interfaces.IFactory;

public abstract class VehicleFactory {
    public abstract IFactory GetVehicle(String vehicle);
}