package client;

import model.Circle;
import model.IShape;
import model.Rectangle;
import model.Square;

public class ClientWithoutFactory {

    public static void main(String[] args) {
        
        //get an object of Circle and call its draw method.
        IShape shape1 = new Circle();

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        IShape shape2 = new Rectangle();

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        IShape shape3 = new Square();

        //call draw method of square
        shape3.draw();
    }

}
