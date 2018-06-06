package mx.cuu.dev.design.patterns.creational.singleton;

import org.junit.Assert;
import org.junit.Test;

import mx.cuu.dev.design.patterns.creational.singleton.MySingleton;



public class MySingletonTest {
    
    
    @Test
    public void singletonCreation_SuccessTest() {
        MySingleton instanceOne = MySingleton.getInstance();
        MySingleton instanceTwo = MySingleton.getInstance();
        Assert.assertTrue(instanceOne == instanceTwo);
        Assert.assertTrue(instanceOne.getValue().equals(instanceTwo.getValue()));        
    }
    
}
