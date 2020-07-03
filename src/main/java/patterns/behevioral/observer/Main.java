package patterns.behevioral.observer;

public class Main {
    public static void main(String[] args) {

        PressPublisher pressPublisher = new PressPublisher("xyz");

        PressReader adamNowak = new PressReader("Adam Nowak");
        Bilboard bilboard = new Bilboard();

        pressPublisher.addObserver(adamNowak);
        pressPublisher.addObserver(bilboard);

        pressPublisher.publish("Nowy tekst wydany!");

        PressReader tomaszKow = new PressReader("Tomasz Kowalski");
        pressPublisher.addObserver(tomaszKow);

        pressPublisher.publish("Mecz pomiedzy a a a zakonczyl sie remisem!");
    }
}
