package patterns.behevioral.strategy;

public class SwordStrategy implements HitStrategy {
    @Override
    public void hit() {
        System.out.println("Sword hit.");
    }
}
