package design_patterns.creational.abstract_factory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();
        Client client = new Client(factory1);
        client.doSomething();
    }
}
