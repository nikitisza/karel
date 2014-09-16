/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {

    private static final int RECTANGLE_WIDTH = 100;
    private static final int RECTANGLE_HEIGHT = 30;

    public void run() {

        drawBox((getWidth()/2)-RECTANGLE_WIDTH/2, (getHeight()/2)-RECTANGLE_HEIGHT/2);
        drawBox((getWidth()/2)-RECTANGLE_WIDTH/2, (getHeight()/2)-RECTANGLE_HEIGHT/2);
        drawBox((getWidth()/2)-RECTANGLE_WIDTH/2, (getHeight()/2)-RECTANGLE_HEIGHT/2);
        drawBox((getWidth()/2)-RECTANGLE_WIDTH/2, (getHeight()/2)-RECTANGLE_HEIGHT/2);


	}

    private void drawBox (int x,int y) {
        GRect drawRectangle = new GRect(x, y, RECTANGLE_WIDTH, RECTANGLE_HEIGHT);
        drawRectangle.setColor(Color.DARK_GRAY);

        add(drawRectangle);

    }

    private void writeLabel (int x, int y, String boxLabel) {
        GLabel writeLabel = new GLabel(boxLabel, x, y);
        add(writeLabel);
    }
}

