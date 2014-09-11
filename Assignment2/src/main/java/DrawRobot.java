/**
 * Created by Niki on 30/08/2014.
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class DrawRobot extends GraphicsProgram {
    public void run() {

        GOval head = new GOval(300, 80, 90, 90);
        
           head.setFillColor(Color.RED);
           head.setFilled(true);
           head.setColor(Color.red);
           add(head);

           add(new GRect(250, 170, 190, 210));
           add(new GRect(285, 380, 30, 100));
           add(new GRect(375, 380, 30, 100));
    }
}
