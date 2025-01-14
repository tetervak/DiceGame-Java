package ca.tetervak.dicegame;

import ca.tetervak.dicegame.model.DiceImpl;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        out.println("Hello,Dice Game!");

        DiceImpl dice = new DiceImpl();
        for (int i = 1; i <= 10; i++) {
            dice.roll();
            int rand = dice.getValue();
            out.printf("random value %d = %d\n", i, rand);
        }

    }
}