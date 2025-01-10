package ca.tetervak.dicegame;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        out.println("Hello,Dice Game!");

        for (int i = 1; i <= 10; i++) {
            int rand = (int)(Math.random() * 6 + 1);
            out.printf("random value %d = %d\n", i, rand);
        }

    }
}