
package engine;

import sensor.Sensor;

// abstract object with initial static set parameters to be inherited
public abstract class  Engine {
    
    // static fields
    private static int nextSerialNumber = 1500;
    public static final String ENGINE_STAMP = "E";
    
    // private field serial number 
    private int serialNumber;
    
    // Engine object with serialnumber fields
    public Engine() {        
        this.serialNumber = nextSerialNumber;
        nextSerialNumber++;
    }
    
    // get function to return the serial number field 
    public int getSerialNumber(){
        return serialNumber;
    }
    
    //--------------------------------------------------------------------------
    
    // Print Functions
    
     public void displayHeader(){
        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("Engine ");
        System.out.println("------------------------------------------"); 
    }
    
    public void info(){
        System.out.println("serialNumber = " + serialNumber);
    }
    
    // -------------------------------------------------------------------------
    
    // abstract method to be overidded by subclass 
     public abstract Sensor getSensor();
    
    
}
