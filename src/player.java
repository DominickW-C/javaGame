
/**
 * Variables for the players bird.
 *
 * @author Dominick Couture
 */
class Player {
    static int X = 40;
    static int Y = 40;
    static int WIDTH = 20;
    static int HEIGHT = 20;
    //false for down, true for up
    static boolean FALLING = true;

    /**
     * Checks to see if the player hit something.
     */
    public static void checkCollision() {
        if (Y <= 0 || Y >= 480 - WIDTH) {
            System.out.println("hit edge of screen");
            FALLING = !FALLING;
        }
        //TODO: add pipe collisions
    }
}
