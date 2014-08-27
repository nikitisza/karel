/**
 * Created by Niki on 27/08/2014.
 */

import acm.program.ConsoleProgram;

public class Add2Integers extends ConsoleProgram {
    public void run() {

        int n1 = readInt("Enter a number: ");
        int n2 = readInt("Enter the second number: ");
        int total = n1 + n2;
        println("The total is " + total + ".");

    }
}