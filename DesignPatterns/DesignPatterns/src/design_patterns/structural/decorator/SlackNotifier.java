package design_patterns.structural.decorator;

public class SlackNotifier extends ConcreteNotifier{

    public SlackNotifier(Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        super.send(message);
        System.out.println("SEND MESSAGE BY Slack!" + message);
    }
}
