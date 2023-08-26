package design_patterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Product product1 = new ConcreteProduct("Name");
        Product product2 = product1.clone();
        //Product product2 = product1;
        product2.setName("Changed name");
    }
}
