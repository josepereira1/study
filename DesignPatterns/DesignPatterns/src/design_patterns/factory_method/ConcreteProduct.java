package design_patterns.factory_method;

public class ConcreteProduct implements Product {

    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doSomething() {
        System.out.println("Hello " + name);
    }
}
