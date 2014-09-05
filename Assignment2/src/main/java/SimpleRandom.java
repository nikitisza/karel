import acm.program.ConsoleProgram;
import acm.util.*;

/**
 * Created by Niki on 05/09/2014.
 */
public class SimpleRandom extends ConsoleProgram {

    public void run() {
        int diceRoll = myRgen.nextInt(1, 6);
        println("Your lucky number is: " + diceRoll);
    }

    private RandomGenerator myRgen = RandomGenerator.getInstance();
}
