/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	@Override
	public void run() {
		while (frontIsClear()) {
			goToEndOfWall();
			fillLineWithBeeper();
			goToNextLine();
		}
		goToEndOfWall();
		fillLineWithBeeper();
	}
	
	private void goToEndOfWall() {
		turnLeft();
		while (frontIsClear()) {
			move ();
			} 	
		turnAround();
	}
	
	private void fillLineWithBeeper() {
		while (frontIsClear()) {
			stoneBuildProcess();
			move();			
		}
		stoneBuildProcess();
		turnLeft();
	}
	
	private void stoneBuildProcess() {
		if (noBeepersPresent()) {
			putBeeper();
		}
	}
	
	private void goToNextLine() {
		for (int i=0; i<4; i++) {
			move();
		}
	}
}