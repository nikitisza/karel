/*
This figure is simply three GOval objects, two red and one white, drawn in the correct
order. The outer circle should have a radius of one inch (72 pixels), the white circle
has a radius of 0.65 inches, and the inner red circle has a radius of 0.3 inches. The
figure should be centered in the window
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {

    double radiusOuter = 72;
    double radiusMiddle = radiusOuter*0.65;
    double radiusInner = radiusOuter*0.3;
    int yMiddlePoint = getHeight()/2;
    int xMiddlePoint = getWidth()/2;

	public void run()  {

            GOval circle = new GOval(xMiddlePoint - radiusOuter, yMiddlePoint - radiusOuter, 2 * radiusOuter, 2 * radiusOuter);
            circle.setFilled(true);
            circle.setColor(Color.RED);
            add(circle);
        }
    }

