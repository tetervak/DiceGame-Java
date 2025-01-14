package ca.tetervak.dicegame.model;

import java.util.Random;

public class Dice implements Rollable {

    public static final int INIT_VALUE = 1;

    private int value = INIT_VALUE;
    private final Random random;

    public Dice() {
        random = new Random();
    }

    public Dice(int value) {
        this();
        setValue(value);
    }

    public Dice(int value, Random random) {
        this.value = value;
        this.random = random;
    }

    public Dice(Random random) {
        this.random = random;
    }

    @Override
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value < 1 || value > 6){
            throw new IllegalArgumentException("Value must be between 1 and 6");
        }
        this.value = value;
    }

    @Override
    public void roll(){
        value = random.nextInt(1,7);
    }

}
