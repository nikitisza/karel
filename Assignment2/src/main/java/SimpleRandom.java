import acm.program.ConsoleProgram;
import acm.util.*;

/**
 * Created by Niki on 05/09/2014.
 */
public class SimpleRandom extends ConsoleProgram {

    private static final int DICE_SIDES = 6;

    public void run() {
        int numberOfDice = readInt("How many dice do you have?: ");
        int maximumRolledNumber = numberOfDice * DICE_SIDES;
        int rollCounter = 0;

        while (true) {
            int roll = rollDice(numberOfDice);
            rollCounter++;
            if (roll == maximumRolledNumber) break;
            println("Rolled: " + roll);
        }
        println("You had to roll: " + rollCounter + " to get " + maximumRolledNumber);
    }

    private int rollDice(int nOD){
        int total = 0;

        for (int i=0; i<nOD; i++) {
            total += myRgen.nextInt(1,DICE_SIDES);
        }
        return total;
    }

    private RandomGenerator myRgen = RandomGenerator.getInstance();
}
