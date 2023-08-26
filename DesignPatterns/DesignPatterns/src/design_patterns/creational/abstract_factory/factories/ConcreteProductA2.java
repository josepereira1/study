package design_patterns.creational.abstract_factory.factories;

import design_patterns.creational.abstract_factory.ProductA;

public class ConcreteProductA2 implements ProductA {
    @Override
    public void productA() {
        System.out.println("Hello from productA2");
    }
}
