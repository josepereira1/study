package design_patterns.creational.abstract_factory.factories;

import design_patterns.creational.abstract_factory.ProductA;

public class ConcreteProductA1 implements ProductA {
    @Override
    public void productA() {
        System.out.println("Hello from productA1");
    }
}
