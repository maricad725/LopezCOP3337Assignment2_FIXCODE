
package machine;

import engine.Engine;
import java.awt.Color;

public class Car extends Vehicle{
    
    // static fields for Car
    private static final String CARCODE = "CKC";
    private static int nextVin = 2726629;
    
    // fields to be inputed into car object
    private String vinNumber;
    private Engine engine;
    private Color color;

    // default constructor
    public Car() {
    }
    
    // constructor with all inherited and car specific fields
    public Car( Engine engine, Color color, String classCode, int yearBuild) {
        
        super(classCode, yearBuild);
        this.vinNumber = CARCODE + nextVin;
        this.engine = engine;
        this.color = color;
        
        nextVin++;
           
    }

    // -------------------------------------------------------------------------
    
    // setters and getters for the fields in car class
    
    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    //--------------------------------------------------------------------------
    
    // Overrided print methods (polymorphism) 
    
    public void displayHeader(){
        System.out.println("----------------------------------------");
        System.out.println("Car  Display ");
        System.out.println("----------------------------------------");   
    }
    
    public void info(){
        super.info();
        System.out.println("Vin Number = " + vinNumber);
        System.out.println("color = " + color); 
        engine.displayHeader();
        engine.info();
        
        System.out.println("\n\n");
    }
    
        
}
