package design_patterns.creational.factory_method;

public class ConcreteCreatorProduct extends Creator{

    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}
