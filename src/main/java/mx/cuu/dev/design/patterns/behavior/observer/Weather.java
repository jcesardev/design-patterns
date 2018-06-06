package mx.cuu.dev.design.patterns.behavior.observer;

import java.util.Observable;

public class Weather extends Observable {

    private String description;
    
    private int temperature;

    public Weather(final String description, final int temperature) {
        super();
        this.description = description;
        this.temperature = temperature;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(final String description) {
        this.description = description;
        setChanged();
    }

    /**
     * @return the temperature
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(final int temperature) {
        this.temperature = temperature;
        setChanged();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Weather [ Description: " + description + ", Temperature: " + temperature + " °C]";
    }
        
    
}
