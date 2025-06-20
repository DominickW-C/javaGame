import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class app {

    public static void main (String[] args) {

        JFrame frame = new JFrame("Java Game");
        JPanel panel = new JPanel(); 
        Window win = new Window(frame, panel);

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                //creates the window
                win.start();

                JLabel txt = new JLabel();
                txt.setText("test");
                panel.add(txt);
                panel.setBackground(Color.RED);

                Timer test = new Timer (1000, loop -> gameLoop(loop));
                test.start();
            }
        });

        
    }
    private static void gameLoop(ActionEvent act) {

        System.out.println("test");
    }
}

class Window {

    JFrame frame;
    JPanel panel;

    Window (JFrame frame, JPanel panel) {
        this.frame = frame;
        this.panel = panel;
    }

    /**
     * Creates a window with frame and panel given in init.
     */
    public void start() {

        //finds the screensize so that the window can be placed in the middle of screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();

        //sizes frame, default to sys look and feel
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setSize(640, 480);

        //causes the program to close when the frame closes
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(((int)width/2)-320, ((int)height/2)-240);
        
        //makes the frame actually visible
        frame.setVisible(true);

        //sizes panel to frame 
        panel.setSize(640, 480);

        //add panel to frame
        frame.add(panel);
    } 

    public void clear(int testVar) {
        System.out.println("on loop iteration " + testVar);
        this.panel.removeAll();
        this.panel.revalidate();
        this.panel.repaint();
    }
}
