package design_patterns.creational.factory_method;

public abstract class Creator {

    public void doSomething() {
        Product product = createProduct();
        product.setName("Edna Costa Pereira");
        product.doSomething();
    }

    public abstract Product createProduct();
}
