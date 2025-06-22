import javax.swing.*;
import java.awt.event.*;

public class app {
    
    static Window win = new Window();
    static int loopIt = 0;

    //main game loop
    private static void gameLoop(ActionEvent act) {
        //System.out.println("test");
        if (Player.FALLING == true) {
            Player.Y = (Player.Y + 5) % win.WINDOW_WIDTH;
        } else {
            Player.Y = (Player.Y - 5) % win.WINDOW_WIDTH;
        }

        Pipes.update();
        Player.checkCollision();

        //System.out.println(Player.X);
        win.clear(loopIt);
        loopIt++;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //creates the window, and starts main loop
                win.start();
                
                Timer ti = new Timer (17, loop -> gameLoop(loop));
                ti.start();
            }
        });
    }
}


