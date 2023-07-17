package design_patterns.factory_method;

public class ConcreteCreatorProduct extends Creator{
    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}
