import acm.program.ConsoleProgram;

/**
 * Created by Niki on 18/09/2014.
 *
 * this program calculates inches to centimeters
 */
public class InchToCenti extends ConsoleProgram {

    public void run() {
        println("This program converts inches to centimeter.");
        double inches = readDouble("Enter value in inches: ");
        double cm = inches * CENTIMETERS_PER_INCH;
        println(inches + " inch is " + cm + " centimeter");

    }

    private static final double CENTIMETERS_PER_INCH = 2.54;
}
