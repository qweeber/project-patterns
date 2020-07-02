package patterns.behevioral.strategy;

public class SwordStrategy implements HitStrategy {
    @Override
    public String hit() {
        return "Sword hit.";
    }
}
