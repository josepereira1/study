package design_patterns.creational.abstract_factory;

import design_patterns.creational.abstract_factory.factories.ConcreteProductA1;
import design_patterns.creational.abstract_factory.factories.ConcreteProductB1;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
