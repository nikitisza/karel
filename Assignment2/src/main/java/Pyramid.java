/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {

        int height = getHeight();
        int width = getWidth();
        int brickHeightCounter = 0;
        int adjustment = 0;

        for (int brickRow=BRICKS_IN_BASE; brickRow>0; brickRow--) {

            brickHeightCounter++;

            for(int brickCounter=brickRow; brickCounter>0; brickCounter--) {
//                if (brickRow%2!=0) {
//                    adjustment = BRICK_WIDTH/2 * brickHeightCounter;
//                } else {
//                    adjustment = BRICK_WIDTH * brickHeightCounter;
//                }

                GRect brick = new GRect(width - (brickCounter * BRICK_WIDTH) - adjustment, height - (brickHeightCounter*BRICK_HEIGHT), BRICK_WIDTH, BRICK_HEIGHT);

                add(brick);
            }

        }

	}
}

