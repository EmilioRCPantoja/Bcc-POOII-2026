package model;

import interfaces.IFactory;

public class Scooter implements IFactory {
    
        @Override
        public void Drive(int miles)
        {
            System.out.println(
                String.format("Drive the Scooter : %d km", miles));
        }
    }