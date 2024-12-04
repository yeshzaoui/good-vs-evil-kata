import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodVsEvilTest {

    private final GoodVsEvil goodVsEvil = new GoodVsEvil();

    @Test
    void should_evil_win() {
        // When
        String result = goodVsEvil.battle("6391 9957 7142 7773 7634 2268", "4436 6072 1586 6660 8357 5379 4001");

        // Then
        assertEquals("Battle Result: Evil eradicates all trace of Good", result);
    }

    @Test
    void should_good_win() {
        // When
        String result = goodVsEvil.battle("0 0 0 0 0 10", "0 1 1 1 1 0 0");

        // Then
        assertEquals("Battle Result: Good triumphs over Evil", result);
    }

    @Test
    void should_be_equal() {
        // When
        String result = goodVsEvil.battle("0 0 0 0 0 10", "0 0 0 0 0 0 10");

        // Then
        assertEquals("Battle Result: No victor on this battle field", result);

    }
}