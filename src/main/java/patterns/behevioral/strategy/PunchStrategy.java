package patterns.behevioral.strategy;

public class PunchStrategy implements HitStrategy {
    @Override
    public String hit() {
        return "Punch hit.";
    }
}
