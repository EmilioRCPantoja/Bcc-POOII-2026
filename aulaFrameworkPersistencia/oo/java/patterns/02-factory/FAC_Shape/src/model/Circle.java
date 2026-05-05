package model;

public class Circle implements IShape {

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
   
   public void spin(){
       System.out.println("Inside Circle::spin() method");
   }
}
