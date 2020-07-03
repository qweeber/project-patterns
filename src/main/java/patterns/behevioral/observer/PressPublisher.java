package patterns.behevioral.observer;

import java.util.HashSet;
import java.util.Set;

public class PressPublisher {
    private String name;

    private Set<PressObserver> observers = new HashSet<>();

    public PressPublisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void publish(String paper){
        System.out.println("Wydawca " + name + " wydaje: " + paper);
        observers.forEach(observers -> observers.update(paper));
    }

    public void addObserver(PressObserver observer){
        observers.add(observer);
    }
}
