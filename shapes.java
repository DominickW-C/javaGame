import javax.swing.*;
import java.awt.*;

class rect extends JComponent{
    /**
     * Draws a simple rectangle to the panel given.
     *
     * g: the graphics object that will be used to draw
     * panel: the panel to draw the rectangle to
     * x: the x cord for the rectangle
     * y: the y cord for the rectangle
     * width: the width of the rectangle
     * height: the height of the rectangle
     *
     */
    public void drawRect(Graphics g, JPanel panel, int x, int y, int width, int height) {
        g.drawRect(x, y, width, height);
    }
} 
