import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
        //NOTE: this panel is focusable
        frame.add(panel);
        frame.addKeyListener(new checkKey());
    } 

    public void clear(int testVar) {
        //System.out.println("on loop iteration " + testVar);
        
        panel.removeAll();
        panel.revalidate();
        panel.repaint();
    }
}

class MainPanel extends JPanel {
    //FIXME: renders very pixelated
    Font mainFont = new Font("Arial", 0, 40);

    @Override
    public void paintComponent(Graphics g) {
        g.setFont(mainFont);
        super.paintComponent(g);

        //TODO: center align text and put in middle of screen
        g.drawString(Player.SCORE.toString(), 40, 60);

        g.drawRect(Player.X, Player.Y, Player.WIDTH, Player.HEIGHT);
        g.fillRect(Pipes.pipe1.X, Pipes.pipe1.Y, Pipes.pipe1.WIDTH, Pipes.pipe1.HEIGHT);
        g.fillRect(Pipes.pipe2.X, Pipes.pipe2.Y, Pipes.pipe2.WIDTH, Pipes.pipe2.HEIGHT);
        
        //draws the bottom half of the pipes
        g.fillRect(Pipes.pipe1.X, Pipes.pipe1.BOTTOM_Y, Pipes.pipe1.WIDTH, Pipes.pipe1.BOTTOM_HEIGHT);
        g.fillRect(Pipes.pipe2.X, Pipes.pipe2.BOTTOM_Y, Pipes.pipe2.WIDTH, Pipes.pipe2.BOTTOM_HEIGHT);
    }
}

class checkKey implements KeyListener {

    public void keyPressed(KeyEvent e) {

        if (e.getKeyChar() == ' ') {
            Player.GRAVITY = -30;
        }

        //USED FOR DEBUGGING PURPOSES ONLY
        /*
        if (e.getKeyChar() == 'w')  {
            Player.UP = true;
        }
        
        if (e.getKeyChar() == 's')  {
            Player.DOWN = true;
        }
        if (e.getKeyChar() == 'a')  {
            Player.LEFT = true;
        }  
        if (e.getKeyChar() == 'd')  {
            Player.RIGHT = true;
        }
        */
    }

    //Don't really need these two methods to do anything
    public void keyReleased(KeyEvent e) {

        //USED FOR DEBUGGING PURPOSES ONLY
        /*
        if (e.getKeyChar() == 'w')  {
            Player.UP = false;
        }
        
        if (e.getKeyChar() == 's')  {
            Player.DOWN = false;
        }
        if (e.getKeyChar() == 'a')  {
            Player.LEFT = false;
        }  
        if (e.getKeyChar() == 'd')  {
            Player.RIGHT = false;
        }
        */
    }
    public void keyTyped(KeyEvent e) {
    }
}
