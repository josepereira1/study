package design_patterns.creational.singleton;

import java.util.Objects;

public class Product {
    private static Product product;
    private String name;

    private Product() {

    }

    public static Product getInstance() {
        if(Objects.isNull(product)){
            product = new Product();
        }
        return product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
