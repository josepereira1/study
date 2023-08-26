package design_patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        ConcreteNotifier concreteNotifier = new ConcreteNotifier();
        concreteNotifier = new EmailNotifier(concreteNotifier);
        concreteNotifier = new SMSNotifier(concreteNotifier);
        concreteNotifier = new SlackNotifier(concreteNotifier);
        concreteNotifier.send("Olá Mundo!");
    }
}
