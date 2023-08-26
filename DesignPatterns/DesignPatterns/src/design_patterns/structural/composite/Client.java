package design_patterns.structural.composite;

public class Client {
    public static void main(String[] args) {
        Composite composite1 = new Composite();
        Component c1 = new Leaf();
        Component c2 = new Leaf();
        Component c3 = new Leaf();
        Component c4 = new Leaf();
        composite1.add(c1);
        composite1.add(c2);
        Composite composite2 = new Composite();
        composite2.add(c3);
        composite2.add(c4);
        composite1.add(composite2);
        composite1.execute();
    }
}
