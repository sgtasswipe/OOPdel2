package MyDice;

public class TestMyDice {
    public static void main(String[] args) {
        new TestMyDice().run();
    }

    private void run() {
        MyDice diceTest = new MyDice();
        System.out.println("The dice starting value is: " + diceTest.getDiceNumber());

        System.out.println(diceTest.getDiceNumber());
        System.out.println("First dice rolled: " + diceTest.diceRoll());

        System.out.println("Second dice rolled: " +diceTest.diceRoll());
    }
}
