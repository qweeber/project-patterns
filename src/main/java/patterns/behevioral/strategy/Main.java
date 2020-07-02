package patterns.behevioral.strategy;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("kk", new PunchStrategy());
        warrior.hit();
        warrior.hit();

        warrior.setHitStrategy(new SwordStrategy());
        warrior.hit();

        warrior.setHitStrategy(() -> System.out.println("Custom strategy hit."));
        warrior.hit();
    }
}
