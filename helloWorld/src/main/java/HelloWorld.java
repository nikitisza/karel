import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class HelloWorld extends GraphicsProgram {
    public void run() {
        GLabel helloworldlabel = new GLabel("Hello, world", 250, 150);
        add(helloworldlabel);
        helloworldlabel.setFont("Serif-bold-55");
        helloworldlabel.setColor(Color.red);

        for (int i=0; i<3; i++) {
            waitForClick();
            helloworldlabel.setColor(Color.blue);
        }

        helloworldlabel.setLocation(getHeight()/4, getWidth()/4);
        helloworldlabel.setLabel("Oval in Rectangle");

        waitForClick();
        GRect rect1 = new GRect(10, 10, 50, 50);
        rect1.setFilled(true);
        add(rect1);

        waitForClick();
        GRect rect2 = new GRect(125, 300, 400, 200);
        rect2.setFilled(true);
        rect2.setColor(Color.GREEN);
        add(rect2);

        waitForClick();
        GOval oval1 = new GOval(125, 300, 400, 200);
        oval1.setFilled(true);
        oval1.setColor(Color.BLUE);
        add(oval1);

        waitForClick();
        GLine myLine1 = new GLine(200, 330, 100, 200);
        myLine1.setColor(Color.LIGHT_GRAY);
        add(myLine1);

        waitForClick();
        myLine1.move(100, 100);


    }
}

