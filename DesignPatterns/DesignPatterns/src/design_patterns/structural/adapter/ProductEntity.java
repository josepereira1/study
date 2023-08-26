package design_patterns.structural.adapter;

import java.time.LocalDateTime;

public class ProductEntity {
    private String name;
    private LocalDateTime lastUpdate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public ProductEntity(String name, LocalDateTime lastUpdate) {
        this.name = name;
        this.lastUpdate = lastUpdate;
    }

    public ProductEntity() {

    }
}
