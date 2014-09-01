import acm.program.ConsoleProgram;

/**
 * Created by Niki on 01/09/2014.
 */
public class FactorialExample extends ConsoleProgram {

    private static final int MAX_NUM = 10;

    public void run() {

        for (int i = 0; i < 10; i++) {

            println(i + "!=" + factorial(i));
        }

    }


    private int factorial(int n) {

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

}

