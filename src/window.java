import javax.swing.*;
import java.awt.*;

class Window {

    //finds the screensize so that the window can be placed in the middle of screen
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
    double SCREEN_WIDTH = screenSize.getWidth();
    double SCREEN_HEIGHT = screenSize.getHeight();
    int WINDOW_WIDTH = 640;
    int WINDOW_HEIGHT = 480;

    private JFrame frame = new JFrame();
    private JPanel panel = new MainPanel();

    /**
     * Creates a window with frame and panel given in init.
     */
    public void start() {

        //sizes frame, default to sys look and feel
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setSize(640, 480);

        //causes the program to close when the frame closes
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(((int)SCREEN_WIDTH/2)-320, ((int)SCREEN_HEIGHT/2)-240);
        
        //makes the frame actually visible
        frame.setVisible(true);

        //sizes panel to frame 
        panel.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        //add panel to frame
        frame.add(panel);
    } 

    public void clear(int testVar) {
        System.out.println("on loop iteration " + testVar);
        
        panel.removeAll();
        panel.revalidate();
        panel.repaint();
    }
}

class MainPanel extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("test", 10, 20);
        g.drawRect(10,10,10,10);
        g.drawRect(100,100,100,100);
        g.drawRect(Player.X, Player.Y, Player.WIDTH, Player.HEIGHT);

    }
}
