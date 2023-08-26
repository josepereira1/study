package design_patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Product product = Product.getInstance();
        product.setName("Name");

        Product product1 = Product.getInstance();
        product1.setName("Changed name");
    }
}
