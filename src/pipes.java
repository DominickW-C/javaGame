import java.util.Random;

/**
 * Object that creates the two pipes on screen. 
 *
 * @author Dominick Couture
 */
class Pipes {
    private static int PIPE1_OFFSET = 0;
    private static int PIPE2_OFFSET = 340;
    public static pipe pipe1 = new pipe(PIPE1_OFFSET);
    public static pipe pipe2 = new pipe(PIPE2_OFFSET);

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
     * Resets a pipe to the start.
     *
     * @param p the pipe to be reset.
     */
    private static void resetPipe(pipe p) {
        p.X = 640;
        p.HEIGHT = p.rand.nextInt(pipe.GAP_HEIGHT) + 20;
        p.BOTTOM_Y = p.HEIGHT + pipe.GAP;
    }

    /**
     * Resets both pipes to start a new game.
     */
    public static void reset() {
        pipe1.X = 640 + PIPE1_OFFSET;
        pipe1.HEIGHT = pipe1.rand.nextInt(pipe.GAP_HEIGHT) + 20;
        pipe1.BOTTOM_Y = pipe1.HEIGHT + pipe.GAP;
        pipe2.X = 640 + PIPE2_OFFSET;
        pipe2.HEIGHT = pipe2.rand.nextInt(pipe.GAP_HEIGHT) + 20;
        pipe2.BOTTOM_Y = pipe2.HEIGHT + pipe.GAP;
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
    static int GAP = 150;
    static int GAP_HEIGHT = 260;
    Random rand = new Random();
    int Y = 0;  
    int WIDTH = 50;
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
        HEIGHT = rand.nextInt(GAP_HEIGHT) + 20;  
        BOTTOM_Y = HEIGHT + GAP;
        X = 640 + offset;

    }
}
