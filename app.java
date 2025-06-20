import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class app {

    static JFrame frame = new JFrame("Java Game");
    static JPanel panel = new JPanel(); 
    static Window win = new Window(frame, panel);
    static int ii = 0; 
    static Color[] colorArr = {Color.RED, Color.BLUE, Color.GREEN};
    
    private static Color changeBack() {
        ii = (ii + 1) % 3;
        return colorArr[ii];
    }

    //current todo 
    private static Rectangle drawRect(int x, int y, int width, int height) {
        return new Rectangle(x, y, width, height);

    }

    //main game loop
    private static void gameLoop(ActionEvent act) {
        System.out.println("test");
        panel.setBackground(changeBack());
        win.clear(1);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //creates the window, and starts main loop
                win.start();
                //frame.add(drawRect(20,20,20,20));
                
                Timer ti = new Timer (1000, loop -> gameLoop(loop));
                ti.start();
            }
        });
    }
}


