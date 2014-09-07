import acm.program.ConsoleProgram;

/**
 * Created by Niki on 07/09/2014.
 *
 * This program is about to display the terms in the Fibonacci sequence, starting with Fib(0)
 and continuing as long as the terms are less than 10,000. The Fibonacci sequence
 In the 13th century, the Italian mathematician Leonardo Fibonacci—as a way to explain
 the geometric growth of a population of rabbits—devised a mathematical sequence that
 now bears his name. The first two terms in this sequence, Fib(0) and Fib(1), are 0 and 1,
 and every subsequent term is the sum of the preceding two.
 */


public class FibonacciSequence extends ConsoleProgram {

    private static final int MAX_TERM_VALUE = 10000;

        public void run() {
            println("This program displays the Fibonacci Sequence until 10,000:");

            int fibNumber1 = 0;
            int fibNumber2 = 1;

            while (fibNumber1 <= MAX_TERM_VALUE) {
                println(fibNumber1);
                int fibNumber3 = (fibNumber1 + fibNumber2);
                fibNumber1 = fibNumber2;
                fibNumber2 = fibNumber3;
            }
        }

}
