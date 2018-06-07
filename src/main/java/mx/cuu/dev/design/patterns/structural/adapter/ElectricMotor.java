package mx.cuu.dev.design.patterns.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElectricMotor {
    
    private static final Logger LOG = LoggerFactory.getLogger(ElectricMotor.class);
    
    private boolean connected = false;

    public ElectricMotor() {
        LOG.info("Creating Electric motor.");
        this.connected = false;
    }

    public void connect() {
        LOG.info("Connecting electric motor.");
        this.connected = true;
    }

    public void activate() {
        if (!this.connected) {
            LOG.info("The electric motor can't be activate why it's not connected");
        } else {
            LOG.info("Activating electric motor.");
        }
    }

    public void moveFaster() {
        if (!this.connected) {
            LOG.info("The electric motor can't move faster why it's not connected");
        } else {
            LOG.info("Moving faster, raising the voltage.");
        }
    }

    public void stop() {
        if (!this.connected) {
            LOG.info("The electric motor can't be stopped why it's not connected");
        } else {
            LOG.info("Stopping electric motor.");
        }
    }

    public void disconnect() {
        LOG.info("Disconnecting electric motor.");
        this.connected = false;
    }
}
