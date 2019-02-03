
package sensor;

import java.util.ArrayList;
import java.util.Date;

public class MTemperatureSensor  extends MechanicalSensor{
    
    private boolean unitInFahrenheit;
    
    //--------------------------------------------------------------------------
    // constructors
    //--------------------------------------------------------------------------
    
    public MTemperatureSensor() {
    }

    public MTemperatureSensor(boolean unitInFahrenheit, Date dateInstalled, 
                              Date nextServiceDate, Double value, ArrayList<Double> historicData, 
                              boolean status, String manufacturer) {
        
        super(dateInstalled, nextServiceDate, value, historicData, status, manufacturer);
        
        this.unitInFahrenheit = unitInFahrenheit;
    }

    // getter for determining whether the parameter value for temperature is in Fahrenheit or celsius
    public Double getValue(){
        
        if(unitInFahrenheit){
            return super.getValue();
        } else{
             return convertFartenheitToCelsius();
        }
    }
    
    // conversion method for value in celsius
    private Double convertFartenheitToCelsius(){
        Double value = (super.getValue() - 32) * 5/9;
        return value;
    }
    
    // this mtehod has not been implemented yet. Please Ignore it for time being.
    private void changeUnits(){
        
        if(!unitInFahrenheit){
            unitInFahrenheit = false;
        }else {
            unitInFahrenheit = true;
        }
        
    }
    
}
