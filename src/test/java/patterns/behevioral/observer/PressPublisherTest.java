package patterns.behevioral.observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class PressPublisherTest {
    private PressPublisher pressPublisher;

    @BeforeEach
    void setUp() {
        pressPublisher = new PressPublisher("XYZ");
    }

    @Test
    void getNameTest() {
        assertEquals("XYZ", pressPublisher.getName());
    }

    @Test
    void publish() {
        assertThat(pressPublisher);

    }

    @Test
    void addObserver() {
    }
}