package design_patterns.creational.abstract_factory;


import design_patterns.creational.abstract_factory.factories.ConcreteProductA2;
import design_patterns.creational.abstract_factory.factories.ConcreteProductB2;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
