package design_patterns.structural.decorator;

import java.util.Objects;

public class ConcreteNotifier implements Notifier {

    private Notifier notifier;

    public ConcreteNotifier() {

    }

    public ConcreteNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        if(Objects.nonNull(notifier)) {
            notifier.send(message);
        }
    }
}
