package classes;

/*

https://medium.com/@akshatsharma0610/abstract-factory-design-pattern-in-java-45a326c8fc9f

Difference between Abstract Factory Design Pattern and Factory Design Pattern
The main difference between a “factory method” and an “abstract factory” 
is that the factory method is a single method, and an abstract factory is an object.

*/

public class Phone
{
    String description;
    public Phone(String model)
    {
        this.description = model;
    }
    public void getDescription()
    {
        System.out.println(this.description);
    }
}