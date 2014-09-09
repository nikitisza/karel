import acm.program.ConsoleProgram;

/**
 * Created by Niki on 09/09/2014.
 */
public class StudentCounter extends ConsoleProgram {

    public void run() {

        Incrementor count1 = new Incrementor(); //starts at 1
        Incrementor count2 = new Incrementor(1000);

        println("Five values for count1:");
        CountFiveTimes(count1);

        println("Five value for count2:");
        CountFiveTimes(count2);

        println("Another value for count1:");
        CountFiveTimes(count1);
    }

    private void CountFiveTimes(Incrementor counter) {
        for (int i = 0; i < 5; i++) {
            println(counter.nextValue());
        }
    }
}
