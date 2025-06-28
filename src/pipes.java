import java.util.Random;

/**
 * Object that creates the two pipes on screen. 
 *
 * @author Dominick Couture
 */
class Pipes {
    public static pipe pipe1 = new pipe(0);
    public static pipe pipe2 = new pipe(340);

    /**
     * Updates the pipes positions and moves them if needed.
     */
    public static void update() {
        //higher number will speed this up
        pipe1.X -= 5;
        pipe2.X -= 5;
        checkAtEnd();
    }

    /**
     * Checks if the end of the screen was reached.
     */
    public static void checkAtEnd() {
        if (pipe1.X <= -40) {
            resetPipe(pipe1); 
        }
        if (pipe2.X <= -40) {
            resetPipe(pipe2);
        }
    }

    /**
     * Resets the pipe to the start.
     *
     * @param p the pipe to be reset.
     */
    private static void resetPipe(pipe p) {
        p.X = 640;
        p.HEIGHT = p.rand.nextInt(230) + 20;
        p.BOTTOM_Y = p.HEIGHT + 80;
    }

    /**
     * Checks if a point was scored (75 not 80 to make sure pipe was cleared).
     */
    public static void checkScore() {
        if (pipe1.X + pipe1.WIDTH == 75) {
            Player.SCORE ++;
        }
        if (pipe2.X + pipe1.WIDTH == 75) {
            Player.SCORE ++;
        } 
    }

}

/**
 * Used to build the top and bottom of a pipe.
 *
 * @author Dominick Couture
 */
class pipe {
    Random rand = new Random();
    int Y = 0;  
    int WIDTH = 40;
    int X;
    int HEIGHT;
    //added the variables here so collision is easier
    int BOTTOM_Y;
    int BOTTOM_HEIGHT = 700;

    /**
     * Init pipe.
     *
     * @param offset the offset for the pipe so they don't overlap.
     */
    pipe(int offset) {
        HEIGHT = rand.nextInt(440) + 20;  
        BOTTOM_Y = HEIGHT + 80;
        X = 640 + offset;

    }
}
