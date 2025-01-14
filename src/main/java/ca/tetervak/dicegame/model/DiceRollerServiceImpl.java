package ca.tetervak.dicegame.model;

import java.util.ArrayList;
import java.util.List;

public class DiceRollerServiceImpl implements DiceRollerService {

    private final Rollable rollable;

    public DiceRollerServiceImpl(Rollable rollable) {
        this.rollable = rollable;
    }

    @Override
    public DiceRollData getRollData(int numberOfDice) {

        if(numberOfDice < 1){
            throw new IllegalArgumentException("Illegal Number of Dice " + numberOfDice);
        }

        List<Integer> list = new ArrayList<>(numberOfDice);
        for(int i = 0; i < numberOfDice; i++){
            rollable.roll();
            list.add(rollable.getValue());
        }

        return new DiceRollDataImpl(list);
    }
}
