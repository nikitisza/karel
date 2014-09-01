import acm.program.ConsoleProgram;

/**
 * Created by Niki on 01/09/2014.
 */
public class FactorialExample_2 extends ConsoleProgram {

    public void run() {

        println("This program calculates factorial.");
        int i = readInt("Enter a number: ");
        println(factorial(i));
    }

    private double factorial(int n) {

        double result = 1;

        for(int i=1; i<=n; i++) {
            result = result*i;
        }

        return result;
    }
}
