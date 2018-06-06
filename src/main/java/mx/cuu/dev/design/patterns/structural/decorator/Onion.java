package mx.cuu.dev.design.patterns.structural.decorator;

public class Onion extends PizzaToppingsDecorator{
    
    public Onion(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {        
        return this.pizza.getDescription() + " - Onios";
    }

    @Override
    public Double getCost() {
        return pizza.getCost() + 1.5;
    }

}
