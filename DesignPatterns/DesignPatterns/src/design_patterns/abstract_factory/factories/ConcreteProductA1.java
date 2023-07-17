package design_patterns.abstract_factory.factories;

import design_patterns.abstract_factory.ProductA;

public class ConcreteProductA1 implements ProductA {
    @Override
    public void productA() {
        System.out.println("Hello from productA1");
    }
}
