package mx.cuu.dev.design.patterns.behavior.observer;

import java.util.Observable;
import java.util.Observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeatherObserver implements Observer {
    
    private String name;

    private static final Logger LOG = LoggerFactory.getLogger(WeatherObserver.class);
    
    public WeatherObserver(final String name) {
        this.name = name;
    }
    
    @Override
    public void update(final Observable observable, final Object obj) {
        LOG.info("[{}] The weather has changed: {}", this.name, observable);
    }

}
