
package sensor;

import java.util.Date;
import java.util.ArrayList;


public class MechanicalSensor extends Sensor{
    
    private static final String TYPE ="Mechanical";
    
    private Date dateInstalled;
    private Date nextServiceDate;
    private Double value;
    private ArrayList<Double> historicData;
    
    //--------------------------------------------------------------------------
    // Constructors
    //--------------------------------------------------------------------------

    public MechanicalSensor() {
    }

    public MechanicalSensor(Date dateInstalled, Date nextServiceDate, Double value, 
                            ArrayList<Double> historicData, boolean status, String manufacturer) {
        super( status, manufacturer, TYPE);
        this.dateInstalled = dateInstalled;
        this.nextServiceDate = nextServiceDate;
        this.value = value;
        this.historicData = historicData;
    }
    
    //--------------------------------------------------------------------------
    // Setter and Getters
    //--------------------------------------------------------------------------
    
    public Date getDateInstalled() {
        return dateInstalled;
    }

    public void setDateInstalled(Date dateInstalled) {
        this.dateInstalled = dateInstalled;
    }

    public Date getNextServiceDate() {
        return nextServiceDate;
    }

    public void setNextServiceDate(Date nextServiceDate) {
        this.nextServiceDate = nextServiceDate;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public ArrayList<Double> getHistoricData() {
        return historicData;
    }

    public void setHistoricData(ArrayList<Double> historicData) {
        this.historicData = historicData;
    }

    //--------------------------------------------------------------------------
    // Util. Methods
    //--------------------------------------------------------------------------
    public void displayHeader() {
        System.out.println("");
        System.out.println("Mechanical Senser ");
        System.out.println("------------------------------------------");
    }
    
    

   
}
