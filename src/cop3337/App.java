//=============================================================================
// PROGRAMMER:          Alex Lopez	
// PANTHER ID:		6132200	
//
// CLASS:    		COP3337
// SECTION:     	U10
// SEMESTER:            Fall 2018
// CLASSTIME:   	Your COP3337 course meeting time :example M/W 7:50-9:05 pm
//
// Project:     	Assignment 2
// DUE: 10/21/18        
//
// CERTIFICATION: I certify that this work is my own and that
//                               none of it is the work of any other person.
//=============================================================================

package cop3337;

import engine.*;
import java.awt.Color;
import machine.Bicycle;
import machine.Vehicle;
import machine.Car;

public class App {

    public static void main(String[] args) {
        
        // Engine engine is abstract: use Gas Engine 
        
        GasEngine gasEngine = new GasEngine(6, 249.4, false);
        Car car = new  Car(gasEngine,Color.BLACK, Vehicle.CLASSCODE_SMALL, 2018);
        
        car.getEngine().getSensor().runrest();
        
        Bicycle bicycle = new Bicycle(Color.BLUE, "Scott", Vehicle.CLASSCODE_NONTRANS, 2018);
        
        processVehicle(car);
        processVehicle(bicycle);
       
    }
    
    public static void processVehicle(Vehicle v){
        v.displayHeader();
        v.info();
        
    }
    
}
