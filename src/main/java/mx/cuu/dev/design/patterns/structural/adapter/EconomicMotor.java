package mx.cuu.dev.design.patterns.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EconomicMotor extends AbstractMotor {
    private static final Logger LOG = LoggerFactory.getLogger(EconomicMotor.class);

    public EconomicMotor() {
        super();
        LOG.info("Creation Economic Motor");
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
