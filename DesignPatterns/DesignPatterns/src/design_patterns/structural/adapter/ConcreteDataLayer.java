package design_patterns.structural.adapter;

public class ConcreteDataLayer implements DataLayer{

    private DatabaseService databaseService;

    public ConcreteDataLayer(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    @Override
    public Product save(Product product) {
        ProductEntity product1 = ProductMapper.toProductEntity(product);
        product1 = databaseService.save(product1);
        Product product2 = ProductMapper.toProduct(product1);
        return product2;
    }
}
