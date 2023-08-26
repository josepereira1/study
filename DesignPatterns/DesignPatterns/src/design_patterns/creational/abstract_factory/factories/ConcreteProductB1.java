package design_patterns.creational.abstract_factory.factories;

import design_patterns.creational.abstract_factory.ProductB;

public class ConcreteProductB1 implements ProductB {
    @Override
    public void productB() {
        System.out.println("Hello from productB1");
    }
}
