/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	
	
	@Override
	public void run() {
		
		turnLeft();
		
		while (frontIsClear()) {
				
			while (facingNorth()) {
				putBeeper();
				
				if (frontIsClear()) {	
					move();
				}
				
				if (frontIsClear()) {
					move();		
				} else {
					if (noBeepersPresent()) {
						if (frontIsBlocked()) {
							turnRight();
							if (frontIsClear()) {
								move();
								turnRight();
							}
						}
					} else {
						if (frontIsBlocked()) {
							turnRight();
							if (frontIsClear()) {
								move();
								turnRight();
								move();
							}
						}
					}
					
				}
			} /*end of first while */
			
			while (facingSouth()) {
				putBeeper();
				
				if (frontIsClear()) {
					move();
				}
				
				if (frontIsClear()) {
					move();
				} else {
					if (frontIsBlocked()) {
						turnLeft();
						if (frontIsClear()) {
							move();
							turnLeft();
						}
					} 
				}
			} /*end of second while */	
		}
	}
	
}


