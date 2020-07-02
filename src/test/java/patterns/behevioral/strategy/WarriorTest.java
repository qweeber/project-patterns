package patterns.behevioral.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


class WarriorTest {
    private Warrior warrior;

    @BeforeEach
    public void setup(){
        warrior = new Warrior("Diego", new SwordStrategy());
    }

    @Test
    public void getNameTest() {
        assertThat(warrior.getName())
                .as("Warrior name should be Diego")
                .isEqualTo("Diego");
    }

    @Test
    void hit() {
        assertEquals("Sword hit.", warrior.hit());
    }
}