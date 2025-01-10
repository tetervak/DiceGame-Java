package ca.tetervak.dicegame.model;

public class Dice {

    public static final int INIT_VALUE = 1;

    private int value = INIT_VALUE;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value < 1 || value > 6){
            throw new IllegalArgumentException("Value must be between 1 and 6");
        }
        this.value = value;
    }

    public void roll(){
        value = (int)(Math.random() * 6 + 1);
    }

}
