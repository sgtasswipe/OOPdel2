package MyDice;

import java.util.Random;

public class MyDice {
    private int diceNumber;
    public MyDice() {
        diceRoll(); // constructor rolls dice once, so starting value isnt 0 when we "get" value in TestMyDice
    }
    public int getDiceNumber() {
        return diceNumber;
    }

    public void setDiceNumber(int diceNumber) {
        this.diceNumber = diceNumber;
    }

    public int diceRoll() {
        Random random = new Random();
        diceNumber = random.nextInt(6)+1;
        return diceNumber;
    }

}
