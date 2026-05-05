package model;

import interfaces.IFactory;

public class Bike implements IFactory {
    
    @Override
    public void Drive(int miles)
    {
        System.out.println(
                String.format("Drive the Bike : %d km", miles));
    }
}