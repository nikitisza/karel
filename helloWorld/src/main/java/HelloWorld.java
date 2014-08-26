import acm.graphics.GLabel;
import acm.program.*;

import java.awt.*;

public class HelloWorld extends GraphicsProgram {
    public void run() {
        GLabel helloworldlabel = new GLabel("Hello, world", 250, 250);
        add(helloworldlabel);
        helloworldlabel.setFont("Helvetica-55");
        helloworldlabel.setColor(Color.red);

        for (int i=0; i<5; i++) {
            waitForClick();
            helloworldlabel.setColor(Color.blue);
        }
        helloworldlabel.setLabel("The End");
    }
}