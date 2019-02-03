package sensor;
public class Sensor {
    
    // sensor fields
    private static int nextIdentifier = 2000;
    
    private  int identifier;
    private static String id;
    private boolean status;
    private String manufacturer;
    private String type;
    
    
    //--------------------------------------------------------------------------
    // constructors
    //--------------------------------------------------------------------------

    
    public Sensor() {
    }

    public Sensor( boolean status, String manufacturer, String type) {
        this.identifier = nextIdentifier;
        this.status = status;
        this.manufacturer = manufacturer;
        this.type = type;
        
        nextIdentifier++;
    }
    
    //--------------------------------------------------------------------------
    // setter and getters
    //--------------------------------------------------------------------------

    public static String getId(){
        return id;
    }

    public static void setId(String id) {
        Sensor.id = id;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }
    
    

    //--------------------------------------------------------------------------
    // Util. Print Methods 
    //--------------------------------------------------------------------------
    public void displayHeader() {
        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("Sensor ");
        System.out.println("------------------------------------------");
    }
    
    public void info(){
        System.out.println("identifier = " + identifier);
        System.out.println("status = " + status);
        System.out.println("Manufacturer = " + manufacturer);
    }
    
    //--------------------------------------------------------------------------
    // rest functions(used to reset sensors)
    
    private void rest(){
        System.out.println("Sensor has rested");
    }
    
    // this is the public interface to access rest method: to use with implementation of a verification process. 
    public void runrest()
    {
        rest();
    }
    
            
    
}
