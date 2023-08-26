package design_patterns.creational.prototype;

public interface Product {
    String getName();
    void setName(String name);
    Product clone();
}
