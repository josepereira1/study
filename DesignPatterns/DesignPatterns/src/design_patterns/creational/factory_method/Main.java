package design_patterns.creational.factory_method;

public class Main {
    public static void main(String[] args) {
        ConcreteCreatorProduct creator = new ConcreteCreatorProduct();
        creator.doSomething();
    }
}