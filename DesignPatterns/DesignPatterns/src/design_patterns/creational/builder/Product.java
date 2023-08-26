package design_patterns.creational.builder;

import java.math.BigDecimal;

public class Product {

    private String name;
    private BigDecimal pvp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPvp() {
        return pvp;
    }

    public void setPvp(BigDecimal pvp) {
        this.pvp = pvp;
    }
}
