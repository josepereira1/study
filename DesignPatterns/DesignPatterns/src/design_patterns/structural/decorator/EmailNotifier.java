package design_patterns.structural.decorator;

public class EmailNotifier extends ConcreteNotifier{

    public EmailNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("SEND MESSAGE BY Email!" + message);
    }
}
