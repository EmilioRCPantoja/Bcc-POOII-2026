package model;

// https://www.tutorialspoint.com/design_pattern/factory_pattern.htm

/*

In Factory pattern, we create object without exposing the 
creation logic to the client and refer 
to newly created object using a common interface.

*/

public interface IShape {
    void draw();
}
