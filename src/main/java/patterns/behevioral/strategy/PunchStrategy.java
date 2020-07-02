package patterns.behevioral.strategy;

public class PunchStrategy implements HitStrategy {
    @Override
    public void hit() {
        System.out.println("Punch hit.");
    }
}
