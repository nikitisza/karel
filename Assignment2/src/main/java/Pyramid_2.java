/**
 * Created by Niki on 29/08/2014.
 */
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid_2 extends GraphicsProgram {

    /**
     * Width of each brick in pixels
     */
    private static final int BRICK_WIDTH = 30;

    /**
     * Width of each brick in pixels
     */
    private static final int BRICK_HEIGHT = 12;

    /**
     * Number of bricks in the base of the pyramid
     */
    private static final int BRICKS_IN_BASE = 14;

    public void run() {

        int xMiddlepoint = getWidth()/2;
        int bottomBricksWidth = BRICKS_IN_BASE * BRICK_WIDTH;
        int xCursorpointer = xMiddlepoint - (bottomBricksWidth/2);
        int yCursorpointer = getHeight() - BRICK_HEIGHT;

    /*14 row of bricklayer */

        for (int row=0; row<BRICKS_IN_BASE; row++ ) {

            for (int bricks=0; bricks<BRICKS_IN_BASE-row; bricks++){
                GRect brick= new GRect(xCursorpointer, yCursorpointer, BRICK_WIDTH, BRICK_HEIGHT);
                brick.setColor(Color.red);
                brick.setFillColor(Color.lightGray);
                add(brick);
                xCursorpointer = xCursorpointer+BRICK_WIDTH;
            }

            xCursorpointer = xCursorpointer-((BRICKS_IN_BASE-row)*BRICK_WIDTH);
            xCursorpointer = xCursorpointer+(BRICK_WIDTH/2);
            yCursorpointer = yCursorpointer-BRICK_HEIGHT;
        }

    }

}