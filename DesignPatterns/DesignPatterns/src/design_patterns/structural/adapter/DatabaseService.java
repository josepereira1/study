package design_patterns.structural.adapter;

import java.time.LocalDateTime;

public class DatabaseService {
    public ProductEntity save(ProductEntity product) {
        //  do something
        product.setLastUpdate(LocalDateTime.now());
        return product;
    }
}
