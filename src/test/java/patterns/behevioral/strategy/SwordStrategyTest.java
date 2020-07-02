package patterns.behevioral.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwordStrategyTest {

    @Test
    void hit() {
        Warrior warrior = new Warrior("Berlin", new SwordStrategy());
        assertEquals("Sword hit.", warrior.hit());
    }
}