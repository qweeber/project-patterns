package patterns.creational.builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class CarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car.Builder()
                .withBrand("Ford")
                .withModel("Mustang")
                .withCcm(5.0f)
                .withColor("czarny chrom")
                .withMaxSpeed(350)
                .build();
    }

    @Test
    void getModelTest() {

        assertThat(car).isNotNull();

        assertThat(car.getModel())
                .as("Should return Mustang.")
                .isEqualTo("Mustang");
    }

    @Test
    void getBrandTest() {
        assertThat(car.getBrand())
                .as("Should return Ford.")
                .isEqualTo("Ford");
    }

    @Test
    void getMaxSpeedTest() {
        assertThat(car.getMaxSpeed())
                .as("Should return 350.")
                .isEqualTo(350);
    }

    @Test
    void getCcmTest() {
        assertThat(car.getCcm())
                .as("Should return 5.0.")
                .isEqualTo(5.0f);
    }

    @Test
    void getColorTest() {
        assertThat(car.getColor())
                .as("Should return czarny chrom.")
                .isEqualTo("czarny chrom");
    }
}