package design_patterns.creational.abstract_factory;

public class Client {
    private AbstractFactory factory;

    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    public void doSomething() {
        ProductA productA = factory.createProductA();
        productA.productA();
    }
}
