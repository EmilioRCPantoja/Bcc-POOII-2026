package factory;

import interfaces.IFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Bike;
import model.Scooter;

public class ConcreteVehicleFactory extends VehicleFactory {

    @Override
    public IFactory GetVehicle(String Vehicle) {
        switch (Vehicle) {
            case "Scooter": {
                return new Scooter();
            }
            case "Bike": {
                return new Bike();
            }
            default: {
                try {
                    throw new Exception(String.format("Vehicle %s cannot be created", Vehicle));
                } catch (Exception ex) {
                    Logger.getLogger(ConcreteVehicleFactory.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        return null;
    }
    
}
