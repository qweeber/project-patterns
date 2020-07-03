package patterns.behevioral.observer;

public class Bilboard implements PressObserver {
    private String text;

    @Override
    public void update(String paper) {
        System.out.println("Z bilboardu zdejmowany jest tekst " + text
                + ", a od teraz wyswietlany jest: " + (text = paper.substring(0,10)));
    }
}
