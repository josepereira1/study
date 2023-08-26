package design_patterns.structural.decorator;

public class SMSNotifier extends ConcreteNotifier{

    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("SEND MESSAGE BY SMS!" + message);
    }
}
