package design_patterns.structural.composite;

public class Leaf implements Component{
    @Override
    public void execute() {
        System.out.println("I am leaf");
    }
}
