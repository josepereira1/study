package design_patterns.structural.adapter;

import java.time.LocalDateTime;

public interface ProductMapper {
    static ProductEntity toProductEntity(Product product) {
        ProductEntity tmp = new ProductEntity();
        tmp.setName(product.getName());
        return tmp;
    }

    static Product toProduct(ProductEntity product) {
        Product tmp = new Product();
        tmp.setName(product.getName());
        return tmp;
    }
}
