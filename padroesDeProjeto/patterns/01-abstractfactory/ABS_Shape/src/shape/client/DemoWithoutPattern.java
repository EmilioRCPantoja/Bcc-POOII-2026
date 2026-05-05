package shape.client;

import shape.classes.Rectangle;
import shape.classes.RoundedRectangle;
import shape.classes.RoundedSquare;
import shape.classes.Square;
import shape.interfaces.Shape;


public class DemoWithoutPattern
{
   public static void main(String[] args) {
      
      Shape shape1 = new Rectangle();
      shape1.draw();
      
      Shape shape2 = new Square();
      shape2.draw();
      
      RoundedRectangle shape3 = new RoundedRectangle();      
      shape3.draw();
      
      RoundedSquare shape4 = new RoundedSquare();      
      shape4.draw();
      
   }
}