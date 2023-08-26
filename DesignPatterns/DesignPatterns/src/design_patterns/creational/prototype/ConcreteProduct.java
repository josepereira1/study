package design_patterns.creational.prototype;

public class ConcreteProduct implements Product{

    private String name;

    public ConcreteProduct(String name) {
        this.name = name;
    }

    public ConcreteProduct(Product product) {
        this.name = product.getName();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Product clone() {
        return new ConcreteProduct(this);
    }
}
