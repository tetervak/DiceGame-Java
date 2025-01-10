package ca.tetervak.dicegame.model;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @BeforeEach
    void setUp() {
        out.println("Starting test");
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest(name = "setting {0}")
    @ValueSource(ints = {0,7})
    @DisplayName("check set illegal value")
    void setValue_illegalValue(int value) {
        Dice dice = new Dice();
        assertThrows(IllegalArgumentException.class, () -> dice.setValue(value));
    }

    @Test
    @DisplayName("check set legal value")
    void setValue_legalValue() {
        Dice dice = new Dice();
        dice.setValue(5);
        assertEquals(5, dice.getValue());
        assertThrows(IllegalArgumentException.class, () -> dice.setValue(0));
    }


    @DisplayName("check range after roll")
    @RepeatedTest(2)
    void roll() {
        Dice dice = new Dice();
        for (int i = 1; i <= 10; i++) {
            dice.roll();
            assertTrue(dice.getValue() <= 6);
            assertTrue(dice.getValue() >= 1);
            int rand = dice.getValue();
            out.printf("random value %d = %d\n", i, rand);
        }
    }
}