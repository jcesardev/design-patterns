package mx.cuu.dev.design.patterns.structural.decorator;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecoratorPatternTest {
    
    private static final Logger LOG = LoggerFactory.getLogger(DecoratorPatternTest.class);
    
    @Test
    public void decoratorPatternTest() {
        LOG.info("--- Decorator Pattern Test. ---");
        Pizza panPizza = new PanPizza();
        LOG.info("You order is: {}", panPizza.getDescription());
        LOG.info("The cost of your order is: {}", panPizza.getCost());
        LOG.info("--- Adding some toppings ----");        
        panPizza = new Tomatoe(panPizza);
        panPizza = new Onion(panPizza);
        LOG.info("You Order is: {}", panPizza.getDescription());
        LOG.info("The cost of your order is: {}", panPizza.getCost());
        LOG.info("--- Adding some Cheese ----");
        panPizza = new Cheese(panPizza);
        LOG.info("You Order with cheese is: {}", panPizza.getDescription());
        LOG.info("The cost of your order is: {}", panPizza.getCost());
        
    }
}
