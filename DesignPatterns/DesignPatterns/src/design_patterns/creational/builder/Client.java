package design_patterns.creational.builder;

import java.math.BigDecimal;

public class Client {

    private ProductBuilder productBuilder;

    public Client(ProductBuilder productBuilder) {
        this.productBuilder = productBuilder;
    }

    public Product createProduct(String name, BigDecimal pvp) {
        Product product;
        product = productBuilder.reset();
        product = productBuilder.name(name);
        product = productBuilder.pvp(pvp);
        return product;
    }
}
