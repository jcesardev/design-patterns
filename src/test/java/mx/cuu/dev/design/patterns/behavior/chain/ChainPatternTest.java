package mx.cuu.dev.design.patterns.behavior.chain;

import org.junit.Test;

public class ChainPatternTest {
    
    @Test
    public void chainOfResponsibilityTest() {
        AbstractLogger log = LoggerChain.getChainOfLoggers();

        log.logMessage(AbstractLogger.INFO, "This is an information.");

        log.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

        log.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}
