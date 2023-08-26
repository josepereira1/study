package design_patterns.creational.builder;

import java.math.BigDecimal;

public interface ProductBuilder {
    Product reset();
    Product name(String name);
    Product pvp(BigDecimal pvp);
}
