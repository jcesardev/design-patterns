package mx.cuu.dev.design.patterns.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElectricMotorAdapter extends AbstractMotor{
    
    private static final Logger LOG = LoggerFactory.getLogger(ElectricMotorAdapter.class);
    
    private ElectricMotor electricMotor;
    
    public ElectricMotorAdapter() {
        super();
        LOG.info("Creating electric motor adapter.");
        this.electricMotor = new ElectricMotor();
    }

    @Override
    public void turnOn() {
        LOG.info("Turn On electric motor.");
        this.electricMotor.connect();
        this.electricMotor.activate();
    }

    @Override
    public void turnOff() {
        LOG.info("Turn Off electric motor.");
        this.electricMotor.stop();
        this.electricMotor.disconnect();        
    }

    @Override
    public void speedUp() {
        LOG.info("Speed up electric motor.");
        this.electricMotor.moveFaster();
    }

}
