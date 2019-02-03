
package engine;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import sensor.MTemperatureSensor;
import sensor.Sensor;

// subclass of abstract class Engine 
public class GasEngine extends Engine {
    
    // private fields specific to this class
    private int numberOfCylinders;
    private double displacement;
    private boolean turbo;
    private MTemperatureSensor tempSensor;

    // default empty deconstructor
    public GasEngine() {
    }

    // deconstructor with all set fields
    public GasEngine(int numberOfCylinders, double displacement, boolean turbo) {
        super();
        this.numberOfCylinders = numberOfCylinders;
        this.displacement = displacement;
        this.turbo = turbo;
        
        // set up calendar object with Date objects(Date format object not implemented)
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date installDate = new Date();
        Calendar c = Calendar.getInstance();
        
            c.setTime(installDate);
            c.add(Calendar.YEAR, 5);
        
        Date nextServiceDate = c.getTime();
        
        // unimplemented ArrayList: used in parameters of tempsensor object 
        ArrayList<Double> historicData = new ArrayList<>();
            
            historicData.add(0.01);
            historicData.add(22.32);
            historicData.add(287.43);
            historicData.add(159.33);
            historicData.add(30.23);

        tempSensor = new MTemperatureSensor(true, 
                                            installDate, 
                                            nextServiceDate,
                                            76.3, 
                                            historicData, 
                                            true,
                                            "GC");
    }
    
    //--------------------------------------------------------------------------
    
    // get fields
    
    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

   
    public double getDisplacement() {
        return displacement;
    }

    public boolean isTurbo() {
        return turbo;
    }
    
    // overrided method from abstract superclass returning tempsensor 
    public Sensor getSensor(){
        return tempSensor;
    }
    
    //--------------------------------------------------------------------------
    
    // Polymorphic print methods: prints some of the fields in GasEngine
    
    public void displayHeader(){
        System.out.println("");
        System.out.println("Gas Engine ");
        System.out.println("------------------------------------------"); 
    }
    
    public void info(){
        System.out.println("Code = " + Engine.ENGINE_STAMP + "-" + super.getSerialNumber() );
        System.out.println("numberOfCylinders = " + numberOfCylinders);
        System.out.println("displacement = " + displacement);
        System.out.println("turbo = " + turbo);
        tempSensor.displayHeader();
        tempSensor.info();
    }


}
