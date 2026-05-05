package shape.interfaces;

// https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm

public interface Shape {
    void draw();
}

/*

https://medium.com/@akshatsharma0610/abstract-factory-design-pattern-in-java-45a326c8fc9f
The Abstract Factory design pattern is a creational design pattern 
that provides an interface for creating families of 
related or dependent objects without specifying their concrete classes.

https://www.geeksforgeeks.org/abstract-factory-pattern/
Isolation of concrete classes: Because a factory encapsulates the responsibility 
and the process of creating product objects, 
it isolates clients from implementation classes.

Not Ideal for Simple Systems: The Abstract Factory pattern may 
be overkill for smaller, less complex systems 
where the overhead of defining abstract 
factories and products outweighs the benefits of the pattern.

Multiple families of related products: When your system needs 
to be configured with multiple families of related products, 
and you want to ensure that the products from one family 
are compatible with the products from another family.

*/