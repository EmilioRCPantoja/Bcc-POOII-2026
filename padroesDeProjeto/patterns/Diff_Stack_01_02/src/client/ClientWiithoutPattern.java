package client;

import fac.FatorialFactory;
import fac.FatorialProcedural;
import fac.FatorialRecursivo;

public class ClientWiithoutPattern {
   
    public static void main(String[] args) {
 
        int n = 20;
        
        FatorialFactory fat_a = new FatorialProcedural();  
        long start1 = System.currentTimeMillis();
        double r1 = fat_a.fatorial(n);
        long finish1 = System.currentTimeMillis();
        long timeElapsed1 = finish1 - start1;
        String s1 = String.format("r1:%s, em %d ms", r1, timeElapsed1);
        System.out.println(s1);
        
        FatorialFactory fat_b = new FatorialRecursivo();  
        long start2 = System.currentTimeMillis();
        double r2 = fat_b.fatorial(n);
        long finish2 = System.currentTimeMillis();
        long timeElapsed2 = finish2 - start2;
        String s2 = String.format("r2:%s, em %d ms", r2, timeElapsed2);
        System.out.println(s2);
        
        
    }
}



    /*
    
    https://stackoverflow.com/questions/5739611/what-are-the-differences-between-abstract-factory-and-factory-design-patterns
    
    The main difference between a "factory method" and 
    an "abstract factory" is that the factory method is a method, 
    and an abstract factory is an object. 
    
    */
    
    /*
    
    The Factory Method pattern defines an interface for creating objects, 
    but it allows subclasses to decide which class to instantiate. 
    It encapsulates the object creation logic in a separate method, 
    which can be overridden by subclasses to create different types of objects. 
    This pattern is useful when we want to create objects that 
    belong to a single family of classes and defer 
    instantiation to their subclasses.

    
    https://www.pentalog.com/blog/design-patterns/factory-method-design-pattern/
    On the other hand, the Abstract Factory pattern gives us a way 
    to make groups of related or dependent objects without 
    having to specify their concrete classes. 
    It encapsulates a group of factories, each of which creates 
    a family of objects that are related to each other.
    
    */

   /*

    https://stackoverflow.com/questions/1001767/what-is-the-difference-in-case-of-intent-and-application-between-these-two-patte
   
    The key difference is that Factory Method uses inheritance (indirection is vertical e.g. createThing()) and Abstract Factory uses composition (indirection is horizontal e.g. getFactory().createThing()

   */
    