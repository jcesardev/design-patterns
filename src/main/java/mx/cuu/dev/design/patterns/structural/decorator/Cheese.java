package mx.cuu.dev.design.patterns.structural.decorator;

public class Cheese extends PizzaToppingsDecorator {
    
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public String getDescription() {        
        return this.pizza.getDescription() + " - Cheese";
    }

    @Override
    public Double getCost() {
        return this.pizza.getCost() + 2.5;
    }

}
