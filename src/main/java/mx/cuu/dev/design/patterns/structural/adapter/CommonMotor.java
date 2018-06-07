package mx.cuu.dev.design.patterns.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonMotor extends AbstractMotor {

    private static final Logger LOG = LoggerFactory.getLogger(CommonMotor.class);

    public CommonMotor() {
        super();
        LOG.info("Creating Common Motor.");
    }

    @Override
    public void turnOn() {
        LOG.info("Turn On Common Motor.");
    }

    @Override
    public void turnOff() {
        LOG.info("Turn Off Common Motor.");
    }

    @Override
    public void speedUp() {
        LOG.info("Speed Up Common Motor.");

    }

}
