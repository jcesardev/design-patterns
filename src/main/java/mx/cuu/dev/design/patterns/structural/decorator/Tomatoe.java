package mx.cuu.dev.design.patterns.structural.decorator;

public class Tomatoe extends PizzaToppingsDecorator{
    
    public Tomatoe(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " - Tomatoes";
    }

    @Override
    public Double getCost() {
        return pizza.getCost() + 1.0;
    }

}
