/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

    public void run() {
        takeFirstBeepers();

       while (noBeepersPresent()) {
           runTilLineClear();
       }
        putMiddleBeeper();
        cleanWholeLine();
        goFindBeeper();

    }

    private void takeFirstBeepers() {
        putBeeper();
        while (frontIsClear()) {
            move();
        }
        turnAround();
        putBeeper();
        move();
    }

    private void runTilLineClear() {
        while (noBeepersPresent()) {
            move();
        }
        turnAround();
        move();
        putBeeper();
        move();
    }

    private void putMiddleBeeper() {
        turnAround();
        move();
        putBeeper();
    }

    private void cleanWholeLine() {
        while (frontIsClear()) {
            move();
        }
        turnAround();
        while (frontIsClear()) {
            pickBeeper();
            move();
        }
        pickBeeper();
        turnAround();
    }

    private void goFindBeeper() {
        while (noBeepersPresent()) {
            move();
        }
    }
}
