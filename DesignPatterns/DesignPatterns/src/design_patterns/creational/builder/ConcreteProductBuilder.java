package design_patterns.creational.builder;

import java.math.BigDecimal;

public class ConcreteProductBuilder implements ProductBuilder{

    private Product product;

    @Override
    public Product reset() {
        this.product = new Product();
        return this.product;
    }

    @Override
    public Product name(String name) {
        this.product.setName(name);
        return this.product;
    }

    @Override
    public Product pvp(BigDecimal pvp) {
        this.product.setPvp(pvp);
        return this.product;
    }
}
