package design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Composite implements Component {
    private List<Component> components;

    public void add(Component component) {
        if(Objects.isNull(components)) {
            this.components = new ArrayList<>();
        }
        this.components.add(component);
    }

    public void remove(Component component) {
        if(Objects.nonNull(this.components)) {
            this.components.remove(component);
        }
    }

    public List<Component> getChildren() {
        return this.components;
    }

    @Override
    public void execute() {
        System.out.println("I am a composite!");
        this.components.forEach(e -> e.execute());
    }
}
