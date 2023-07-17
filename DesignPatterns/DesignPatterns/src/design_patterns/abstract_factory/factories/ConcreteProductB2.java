package design_patterns.abstract_factory.factories;

import design_patterns.abstract_factory.ProductB;

public class ConcreteProductB2 implements ProductB {
    @Override
    public void productB() {
        System.out.println("Hello from productB2");
    }
}
