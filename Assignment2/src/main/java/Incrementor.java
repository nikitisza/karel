import acm.program.ConsoleProgram;

/**
 * Created by Niki on 09/09/2014.
 */
public class Incrementor {

    //creates Incrementer with given starting counter value
    public Incrementor(int startValue) {
        counter = startValue;
    }

    //creates Incrementor with counter starting at 1
    public Incrementor() {
        counter =1;
    }

    //returns the next value of the counter and increments
    public int nextValue() {
        int temp = counter;
        counter++;
        return temp;
    }

    //private instance variable
    private int counter;
}
