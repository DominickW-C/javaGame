
/**
 * Class for the player
 *
 * @author Dominick Couture
 */
class Player {
    static Integer SCORE = 0;
    static int X = 80;
    static int Y = 100;
    static int WIDTH = 20;
    static int HEIGHT = 20;
    static int GRAVITY = -20;

    //USED FOR DEBUGGING PURPOSES ONLY
    /*
    static boolean UP = false;
    static boolean DOWN = false;
    static boolean LEFT = false;
    static boolean RIGHT = false;
    */

    /**
     * Calculates the gravity for the bird.
     * I have never implemented gravity before,
     * So this could be very wrong but it works
     * pretty good for this game.
     *
     * @return int to add/subtract from Y pos
     */
    public static int addGravity() {
        GRAVITY ++;
        int delta = (int) ((.009 * (GRAVITY * GRAVITY)));
        while (delta > -1 & delta < 1) {
            GRAVITY ++;
            delta = (int) ((.009 * (GRAVITY * GRAVITY)));
        }
        if (GRAVITY <= 0) {
            return delta;
        } else{
            return -delta;
        }
    }

    /**
     * Checks to see if the player hit something.
     */
    public static void checkCollision() {
        if (Y <= 0 || Y >= 480 - WIDTH) {
            System.out.println("hit edge of screen");
        }

        //I could probably do this by putting P1 and P2 in a array and looping but nah this works fine
        
        pipe P1 = Pipes.pipe1;
        pipe P2 = Pipes.pipe2;
       
        //Checks for pipe collision
        
        //Pipe 1
        if ( (((X + WIDTH) >= P1.X) & ((X + WIDTH) <= (P1.X + P1.WIDTH))) ||
             ((X >= P1.X) & (X <= (P1.X + P1.WIDTH))) ) {
        
            //Checks for the top pipe
            if ( (((Y + HEIGHT) >= P1.Y) & ((Y + HEIGHT) <= (P1.Y + P1.HEIGHT))) ||
             ((Y >= P1.Y) & (Y <= (P1.Y + P1.HEIGHT))) ) {
                System.out.println("Collision detected top pipe 1");
            }

            //Checks for bottom pipe
            else if ( (((Y + HEIGHT) >= P1.BOTTOM_Y) & ((Y + HEIGHT) <= (P1.BOTTOM_Y + P1.BOTTOM_HEIGHT))) ||
             ((Y >= P1.BOTTOM_Y) & (Y <= (P1.BOTTOM_Y + P1.BOTTOM_HEIGHT))) ) {
                System.out.println("Collision detected bottom pipe 1");
            }
        }

        //Pipe 2
        if ( (((X + WIDTH) >= P2.X) & ((X + WIDTH) <= (P2.X + P2.WIDTH))) ||
             ((X >= P2.X) & (X <= (P2.X + P2.WIDTH))) ) {

            //Checks for top pipe
            if ( (((Y + HEIGHT) >= P2.Y) & ((Y + HEIGHT) <= (P2.Y + P2.HEIGHT))) ||
             ((Y >= P2.Y) & (Y <= (P2.Y + P2.HEIGHT))) ) {
                System.out.println("Collision detected top pipe 2");
            }

            //Checks for Bottom pipe
            else if ( (((Y + HEIGHT) >= P2.BOTTOM_Y) & ((Y + HEIGHT) <= (P2.BOTTOM_Y + P2.BOTTOM_HEIGHT))) ||
             ((Y >= P2.BOTTOM_Y) & (Y <= (P2.BOTTOM_Y + P2.BOTTOM_HEIGHT))) ) {
                System.out.println("Collision detected bottom pipe 2");
            }
        }
    }
}
