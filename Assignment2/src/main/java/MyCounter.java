import acm.program.ConsoleProgram;

/**
 * Created by Niki on 09/09/2014.
 */
public class MyCounter {

    public MyCounter (int startValue) {
        counter = startValue;
    }

    public MyCounter () {
        counter =1;
    }

    public int nextValue() {
        int temp = counter;
        counter++;
        return temp;
    }

    private int counter;
}
