package mx.cuu.dev.design.patterns.behavior.observer;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.cuu.dev.design.patterns.behavior.observer.Weather;
import mx.cuu.dev.design.patterns.behavior.observer.WeatherObserver;


public class ObserverPatternTest {
    
    private static final Logger LOG = LoggerFactory.getLogger(ObserverPatternTest.class);
    
    @Test
    public void observerTest() {        
        Weather weather = new Weather("HOT", 36);        
        LOG.info("The weather is: {}", weather);
        WeatherObserver screenObserver = new WeatherObserver("SCREEN OBSERVER");
        WeatherObserver webPageObserver = new WeatherObserver("WEB PAGE OBSERVER");
        weather.addObserver(screenObserver);
        weather.addObserver(webPageObserver);
        // Change the weather.
        weather.setTemperature(8);
        weather.setDescription("COLD");        
        LOG.info("The weather has changed. Notify to observers.");
        weather.notifyObservers();           
    }
}
