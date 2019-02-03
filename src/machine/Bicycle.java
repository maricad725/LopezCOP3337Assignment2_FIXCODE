
package machine;

import java.awt.Color;

public class Bicycle extends Vehicle{
    
    // bicycle private fields
    private Color color;
    private String manufacturer;

    // default empty constructor
    public Bicycle() {
    }

    // deconstructor with all inherited and object fields
    public Bicycle(Color color, String manufacturer, String classCode, int yearBuild) {
        super(classCode, yearBuild);
        this.color = color;
        this.manufacturer = manufacturer;
        
    }
    
    //--------------------------------------------------------------------------
    // setters and getters
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    //--------------------------------------------------------------------------
    //Polymorphic print methods
    
    public void displayHeader(){
        System.out.println("----------------------------------------");
        System.out.println("Bicycle  Display ");
        System.out.println("----------------------------------------");   
    }
    
    public void info(){
        super.info();
        System.out.println("Manufacturer = " + manufacturer);
        System.out.println("color = " + color); 
        
        System.out.println("\n\n");
    }

}
