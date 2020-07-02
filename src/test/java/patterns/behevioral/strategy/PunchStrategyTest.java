package patterns.behevioral.strategy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PunchStrategyTest {

    @Test
    void hitTest() {
        Warrior warrior = new Warrior("Diego", new PunchStrategy());
        assertEquals("Punch hit.", warrior.hit());
    }
}