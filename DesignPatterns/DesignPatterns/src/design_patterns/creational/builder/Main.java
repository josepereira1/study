package design_patterns.creational.builder;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new ConcreteProductBuilder());
        Product product = client.createProduct("Name", BigDecimal.ONE);
    }
}
