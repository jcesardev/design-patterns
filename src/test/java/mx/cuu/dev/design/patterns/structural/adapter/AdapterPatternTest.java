package mx.cuu.dev.design.patterns.structural.adapter;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdapterPatternTest {
    
    private static final Logger LOG = LoggerFactory.getLogger(AdapterPatternTest.class);
    
    @Test
    public void adapterDesignPatternTest() {
        
        AbstractMotor commonMotor = new CommonMotor();        
        AbstractMotor economicMotor = new EconomicMotor();        
        AbstractMotor electricMotor = new ElectricMotorAdapter();
        
        LOG.info("--- Turning ON all motors. ---");
        commonMotor.turnOn();
        economicMotor.turnOn();
        electricMotor.turnOn();
        LOG.info("--- Speed up all motors. ---");
        commonMotor.speedUp();
        economicMotor.speedUp();
        electricMotor.speedUp();
        LOG.info("--- Turning off all motors. ---");
        commonMotor.turnOff();
        economicMotor.turnOff();
        electricMotor.turnOff();
    }
    
    
}
