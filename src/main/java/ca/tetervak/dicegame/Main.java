package ca.tetervak.dicegame;

import ca.tetervak.dicegame.model.Dice;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        out.println("Hello,Dice Game!");

        Dice dice = new Dice();
        for (int i = 1; i <= 10; i++) {
            dice.roll();
            int rand = dice.getValue();
            out.printf("random value %d = %d\n", i, rand);
        }

    }
}