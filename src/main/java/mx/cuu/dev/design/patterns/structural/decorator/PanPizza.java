package mx.cuu.dev.design.patterns.structural.decorator;

public class PanPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Pan Pizza";
    }

    @Override
    public Double getCost() {
        return 10.0;
    }

}
