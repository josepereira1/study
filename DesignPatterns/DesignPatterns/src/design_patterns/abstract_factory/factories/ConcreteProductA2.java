package design_patterns.abstract_factory.factories;

import design_patterns.abstract_factory.ProductA;

public class ConcreteProductA2 implements ProductA {
    @Override
    public void productA() {
        System.out.println("Hello from productA2");
    }
}
