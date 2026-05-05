package shape.client;

import shape.classes.factory.AbstractFactory;
import shape.classes.factory.FactoryProducer;
import shape.interfaces.Shape;


public class DemoWithPattern
{
   public static void main(String[] args) {
      
      // shapes without rounded corner
      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
      
      Shape shape1 = shapeFactory.getShape("RECTANGLE");
      shape1.draw();
      
      Shape shape2 = shapeFactory.getShape("SQUARE");
      shape2.draw();
      
      // rounded shapes
      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
      
      Shape shape3 = shapeFactory1.getShape("RECTANGLE");
      shape3.draw();
      
      Shape shape4 = shapeFactory1.getShape("SQUARE");
      shape4.draw();
      
   }
}