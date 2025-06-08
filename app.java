import javax.swing.JFrame;

public class app {
    public static void main (String[] args) {
        System.out.println("test");
        JFrame frame = new JFrame("test");

        //causes the program to close when the frame closes
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //should set the frame size to whatever is inside
        //frame.pack();

        //makes the frame actually visible
        frame.setVisible(true);
        
    }
}
