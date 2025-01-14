package ca.tetervak.dicegame;

import ca.tetervak.dicegame.model.DiceRollData;
import ca.tetervak.dicegame.model.impl.DiceImpl;
import ca.tetervak.dicegame.model.impl.DiceRollDataImpl;

import java.util.List;

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

        out.println("dice = " + dice);

        DiceRollData rollData = new DiceRollDataImpl(List.of(1,2,3));
        out.println("rollData = " + rollData);

    }
}