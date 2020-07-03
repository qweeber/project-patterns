package patterns.creational.singleton.ex1Coin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class CoinTest {
    private static Coin coin;

    @BeforeEach
    void setUp() {
        coin = Coin.getInstance();
        coin.addMoreCoin();
    }

    @Test
    void getInstanceTest() {

        assertThat(coin).isNotNull();

        assertSame(Coin.getInstance(), coin);
    }

    @Test
    void getCoinTest() {
        assertThat(coin.getCoin())
                .isEqualTo(10);
    }

    @Test
    void addMoreCoinTest() {

        coin.addMoreCoin();
        assertThat(coin.getCoin()).isEqualTo(20);

    }

    @Test
    void deductCoinTest() {
        coin.deductCoin();
        assertThat(coin.getCoin()).isEqualTo(9);
    }
}