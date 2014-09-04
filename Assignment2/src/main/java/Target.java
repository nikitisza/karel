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


	public void run()  {

        double radiusOuter = 72;
        double radiusMiddle = radiusOuter*0.65;
        double radiusInner = radiusOuter*0.3;
        double yMiddlePoint = getHeight()/2;
        double xMiddlePoint = getWidth()/2;

        add(circleDraw(xMiddlePoint, yMiddlePoint, radiusOuter, Color.RED));
        add(circleDraw(xMiddlePoint, yMiddlePoint, radiusMiddle, Color.WHITE));
        add(circleDraw(xMiddlePoint, yMiddlePoint, radiusInner, Color.RED));

  }
    private GOval circleDraw(double x,double y, double radius, Color c) {
        GOval circle = new GOval(x-radius,y-radius, radius*2, radius*2);
        circle.setFilled(true);
        circle.setColor(c);
        return circle;
    }

}

