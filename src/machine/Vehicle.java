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

package machine;

// Vehicle class: superclass of car and bicycle
public class Vehicle {
    
    // static int fields used to generate the id of a vehicle 
    private static int nextSerialNumber = 21928400;
    public static int instanceCounter = 0;
    
    // static final methods that describe the traits of any individual vehicle
    public static final String CLASSCODE_TRANS = "Transport";
    public static final String CLASSCODE_NONTRANS = "Non-Transport";
    public static final String CLASSCODE_SMALL = "Small";
    public static final String CLASSCODE_MEDIAN = "Median";
    public static final String CLASSCODE_LARGE = "Large";
    public static final String CLASSCODE_NONE = "None";
    
    //--------------------------------------------------------------------------
    
    // private fields to store the id values for any vehicle
    private String classCode;
    private int serialNumber;
    private int yearBuild;

    // default constructor 
    public Vehicle() {
        this(CLASSCODE_NONE, 0);
    }
    
    // constructor with only classcode
    public Vehicle(String classCode) {
        this(classCode, 0);
    }

    // contructor with both classcode and yearbuild parameters
    public Vehicle(String classCode,int yearBuild){
        nextSerialNumber++;
        instanceCounter++;
        this.classCode = classCode;
        this.serialNumber = nextSerialNumber;
        this.yearBuild = yearBuild;
    }
    
    //--------------------------------------------------------------------------
    // Getters and Setters
    //--------------------------------------------------------------------------
    

    public static int getNextSerialNumber() {
        return nextSerialNumber;
    }

    public static void setNextSerialNumber(int nextSerialNumber) {
        Vehicle.nextSerialNumber = nextSerialNumber;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getYearBuild() {
        return yearBuild;
    }

    public void setYearBuild(int yearBuild) {
        this.yearBuild = yearBuild;
    }
    
    
    //--------------------------------------------------------------------------
    // Print functions (overrided by subclasses)
    
    public void displayHeader(){
        System.out.println("----------------------------------------");
        System.out.println("Vehicle Display ");
        System.out.println("----------------------------------------");   
    }
    
    public void info(){
        System.out.println("Class Code : " + classCode);
        System.out.println("Serial Number : " + serialNumber);
        System.out.println("Year Build : " + yearBuild);  
    }
    
}
