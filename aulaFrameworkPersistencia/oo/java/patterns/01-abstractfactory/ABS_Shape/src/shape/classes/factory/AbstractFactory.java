package shape.classes.factory;

import shape.interfaces.Shape;

public abstract class AbstractFactory {
    
    public abstract Shape getShape(String shapeType) ;
    
}
