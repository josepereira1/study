package design_patterns.structural.adapter;

public class Client {
    public static void main(String[] args) {
        DatabaseService databaseService = new DatabaseService();
        ConcreteDataLayer concreteDataLayer = new ConcreteDataLayer(databaseService);
        Product product = new Product();
        product.setName("Name");
        product = concreteDataLayer.save(product);
    }
}
