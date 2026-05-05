/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

/**
 *
 * @author emi
 */

import interfaces.IFactory;
import model.Bike;
import model.Scooter;

public class ClientWithoutFactory {
    
    public static void main(String[] args) {
         IFactory scooter = new Scooter();
         scooter.Drive(10);
         
         IFactory bike = new Bike();
         bike.Drive(20);
    }
    
    
}
