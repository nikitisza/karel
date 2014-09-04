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

        GOval circle = new GOval(xMiddlePoint-radiusOuter, yMiddlePoint-radiusOuter, 2 * radiusOuter, 2 * radiusOuter);
        circle.setFilled(true);
        circle.setColor(Color.RED);
        add(circle);

        GOval circleMiddle = new GOval(xMiddlePoint-radiusMiddle, yMiddlePoint-radiusMiddle, 2* radiusMiddle, 2 * radiusMiddle);
        circleMiddle.setFilled(true);
        circleMiddle.setColor(Color.white);
        add(circleMiddle);

        GOval circleInner = new GOval(xMiddlePoint-radiusInner, yMiddlePoint-radiusInner, 2*radiusInner, 2*radiusInner);
        circleInner.setFilled(true);
        circleInner.setColor(Color.RED);
        add(circleInner);

  }

}

